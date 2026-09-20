public class GetItIntoGear {
    public static void main(String[] args) {
        int[] gears = {12, 3, 12, 6, 5};

        int first = gears[0];
        int last = gears[gears.length - 1];

        double revs = Math.round(10.0 * first / last * 100) / 100.0;

        if (revs == (int) revs) {
            System.out.println((int) revs);
        } else {
            System.out.println(revs);
        }

        if (gears.length % 2 == 1) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }
    }
}
