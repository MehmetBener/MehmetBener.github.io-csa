public class RobotBuild
{
    public static void main(String[] args)
    {
        String input = "H02B04A02W02T01";
        
        String block_sequence = "" + input.substring(0, 1) + input.substring(3, 4) + input.substring(6, 7) + input.substring(9, 10) + input.substring(12, 13);
        
        System.out.println("Block sequence: " + block_sequence);
        
        String studs_sequence = input.substring(1, 3) + "-" + input.substring(4, 6) + "-" + input.substring(7, 9) + "-" + input.substring(10, 12) + "-" + input.substring(13, 15);

        System.out.println("Stud sequence: " + studs_sequence);
        
        int first_num = Integer.parseInt(studs_sequence.substring(0, 2));
        int second_num = Integer.parseInt(studs_sequence.substring(3, 5));
        int third_num = Integer.parseInt(studs_sequence.substring(6, 8));
        int fourth_num = Integer.parseInt(studs_sequence.substring(9, 11));
        int fifth_num = Integer.parseInt(studs_sequence.substring(12, 14));
        
        String summary = block_sequence.substring(0, 1) + block_sequence.substring(block_sequence.length() - 1, block_sequence.length()) + (first_num + second_num + third_num + fourth_num + fifth_num);
        System.out.println("Summary: " + summary);
        
    }
}
