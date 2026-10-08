import java.util.Scanner;
public class TriageQueue {
    static String n1 = "", n2 = "", n3 = "";  
    static int p1 = 0, p2 = 0, p3 = 0;        
    static void run(Scanner sc) {
        String c = sc.next();
        if (c.equals("A")) {
            String n = sc.next(); int p = sc.nextInt();
            boolean h1 = p > p1, h2 = p > p2, h3 = p > p3;  
            if (p == p1) if (n.compareTo(n1) < 0) h1 = true;
            if (p == p2) if (n.compareTo(n2) < 0) h2 = true;
            if (p == p3) if (n.compareTo(n3) < 0) h3 = true;
            if (p < 1) System.out.println("Invalid priority."); else if (p > 5) System.out.println("Invalid priority.");
            else if (n.equals(n1)) System.out.println(n + " is already in the queue."); else if (n.equals(n2)) System.out.println(n + " is already in the queue."); else if (n.equals(n3)) System.out.println(n + " is already in the queue.");
            else if (!h3) System.out.println("Queue is full. " + n + " not added.");
            else { if (p3 > 0) System.out.print(n3 + " transferred to another hospital. ");
                if (h1) { n3 = n2; p3 = p2; n2 = n1; p2 = p1; n1 = n; p1 = p; } else if (h2) { n3 = n2; p3 = p2; n2 = n; p2 = p; } else { n3 = n; p3 = p; }
                System.out.println(n + " added."); }
        } else if (c.equals("C")) { if (p1 == 0) System.out.println("No patients waiting."); else { System.out.println(n1 + " called in."); n1 = n2; p1 = p2; n2 = n3; p2 = p3; n3 = ""; p3 = 0; } }
        else { if (p1 == 0) System.out.println("Queue is empty."); else { System.out.print("1. " + n1 + " (" + p1 + ")"); if (p2 > 0) System.out.print("    2. " + n2 + " (" + p2 + ")"); if (p3 > 0) System.out.print("    3. " + n3 + " (" + p3 + ")"); System.out.println(); } }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc); run(sc); run(sc); run(sc); run(sc); run(sc); run(sc);
    }
}
