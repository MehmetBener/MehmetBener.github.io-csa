public class FilamentRecord
{
    public static void main(String[] args)
    {
        String input = "PLA-420-275-610-350-495-251";
    
        int first_dash_index = input.indexOf("-");
        String material = input.substring(0, first_dash_index);
        
        int first_num = Integer.parseInt(input.substring(first_dash_index + 1, first_dash_index + 4));
        int second_num = Integer.parseInt(input.substring(first_dash_index + 5, first_dash_index + 8));
        int third_num = Integer.parseInt(input.substring(first_dash_index + 9, first_dash_index + 12));
        int fourth_num = Integer.parseInt(input.substring(first_dash_index + 13, first_dash_index + 16));
        int fifth_num = Integer.parseInt(input.substring(first_dash_index + 17, first_dash_index + 20));
        int sixth_num = Integer.parseInt(input.substring(first_dash_index + 21, first_dash_index + 24));
        
        int total_filament = first_num + second_num + third_num + fourth_num + fifth_num + sixth_num;
        double average = total_filament / 6.0;
        
        System.out.println("Material: " + material);
        System.out.println("Total filament: " + total_filament + " grams");
        System.out.println("Average per spool: " + average + " grams");


    }
}
