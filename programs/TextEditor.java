import java.util.Scanner;
public class TextEditor {
    static String t = "", u = "", r = "";   // text, undoStack, redoStack
    static void run(Scanner sc) {
        String c = sc.next(); int i = 0;
        if (c.equals("W")) { String w = sc.next();
            if (w.indexOf("#") >= 0) System.out.print("Word cannot contain #. ");
            else if (w.equals(t.substring(t.lastIndexOf(" ") + 1))) System.out.print("Repeated word not added. ");
            else { u = t + "#" + u; r = ""; if (t.length() == 0) t = w; else t = t + " " + w; }
        } else if (c.equals("U")) { if (u.length() == 0) System.out.print("Nothing to undo. "); else { r = t + "#" + r; i = u.indexOf("#"); t = u.substring(0, i); u = u.substring(i + 1); }
        } else if (c.equals("R")) { if (r.length() == 0) System.out.print("Nothing to redo. "); else { u = t + "#" + u; i = r.indexOf("#"); t = r.substring(0, i); r = r.substring(i + 1); }
        } else System.out.print("Invalid command. ");
        System.out.println("Text: [" + t + "]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc); run(sc); run(sc); run(sc); run(sc); run(sc); run(sc); run(sc);
    }
}
