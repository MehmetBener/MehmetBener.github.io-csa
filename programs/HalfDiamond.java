public class HalfDiamond
{
    public static void main(String[] args)
    {
        with_while(8);
    }
    
    public static void with_for(int count) {
        for (int n = 1; n <= count; n++) {
            for (int i = 0; i < count - n; i++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= n; m++) {
                System.out.print(m);
            }
            
            for (int m = n - 1; m > 0; m--) {
                System.out.print(m);
            }
            
            System.out.println();
        }
    }
    
    public static void with_while(int count) {
        int n = 1;
        while (n <= count) {
            int i = 0;
            while (i < count - n) {
                System.out.print(" ");
                i++;
            }
            int m = 1;
            while (m <= n) {
                System.out.print(m);
                m++;
            }
            
            m = n - 1;
            while (m > 0) {
                System.out.print(m);
                m--;
            }
            
            System.out.println();
            
            n++;
        }
    }
}
