public class StringDetective
{
    public static void main(String[] args)
    {
        name("MEHMET", "BENER");
        System.out.println(" ");
        bigger("MEHMET", "BENER");
        String up = upper("mehmet bener");
        System.out.println(" ");
        System.out.println(up);
        String low = lower("MEHMET BENER");
        System.out.println(" ");
        System.out.println(low);
    }
    
    public static void bigger(String name, String surname) {
        if (name.length() > surname.length()) {
            System.out.println("Your name is longer than your surname!");
        } else if (name.length() < surname.length()) {
            System.out.println("Your surname is longer than your name!");
        } else {
            System.out.println("Your surname is in equal length compared to your name!");
        }
    }
    
    public static void name(String name, String surname) {
    	int n = 0;
    	int m = 1;
    	while (name.length() > n) {
    		int k = 0;
    		while (m > k) {
    			System.out.print(name.substring(n, n + 1));
    			k++;
    		} 
    		System.out.println(" ");
    		m++;
    		n++;
    	}
    	
    	System.out.println(" ");
    	
    	n = 0;
    	m -= 2;
    	while (surname.length() > n) {
    		int k = 0;
    		while (m > k) {
    			System.out.print(surname.substring(n, n + 1));
    			k++;
    		} 
    		System.out.println(" ");
    		m--;
    		n++;
    	}
    }
    
    public static String upper(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) (c - 32);
            } else {
                result += c;
            }
        }

        return result;
    }
    
    public static String lower(String input) {
        if (input == null) {
            return null;
        }

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char) (c + 32);
            } else {
                result += c;
            }
        }

        return result;
    }
    
}


// 

