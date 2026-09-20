public class FarmerRyan
{
    public static void main(String[] args)
    {
        int[] counts = {241, 675, 897, 12, 4354, 7625};
        int total = 0;
        for (int i = 0; i < counts.length; i++) {
            total += counts[i];
        }
        
        System.out.println("Ryan has to plant " + total + " beans");

    }
}
