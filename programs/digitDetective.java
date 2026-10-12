public class digitDetective
{
    public static void main(String[] args)
    {        
        int num = 154;
        System.out.println("Original num: " + num);
        int num1 = num;
        
        int odd_sum = 0;
        int odd_count = 0;
        int even_sum = 0;
        int even_count = 0;
        
        while (num > 0) {
            int remainder = num % 10;
            
            if (remainder % 2 == 1) {
                odd_sum += remainder;
                odd_count ++;
            } else {
                even_sum += remainder;
                even_count ++;
            }
            
            num -= remainder;
            num /= 10;

        }
        
        System.out.println("Odd Count: " + odd_count);
        System.out.println("Even Count: " + even_count);
        System.out.println("Odd Sum: " + odd_sum);
        System.out.println("Even Sum: " + even_sum);
        
        if (odd_sum >= 10) {
            System.out.println("Jackpot");
        }
        
        int max_digit = maxDigit(num1);
        System.out.println("Max Digit: " + max_digit);
        
        if (odd_count > even_count) {
            System.out.println("Odd is heavier");
        } else if (odd_count < even_count) {
            System.out.println("Even is heavier");
        } else {
            System.out.println("Even and odd are balanced");
        }
        
        int reversed_num = reverseNum(num1);
        System.out.println("Reversed Number: " + reversed_num);
        
        boolean is_palindrome = isPalindrome(num1);
        System.out.println("Is Palindrome? " + is_palindrome);
        
         boolean is_increasing = isIncreasing(num1);
        System.out.println("Is Increasing? " + is_increasing);
        
        int odd_root = oneDigit(odd_sum);
        System.out.println("Odd Sum Reduced To One Digit: " + odd_root);
        
        int no_even = deleteEven(num1);
        System.out.println("Without Even Digits: " + no_even);
        
        boolean is_armstrong = isArmstrong(num1);
        System.out.println("Is Armstrong? " + is_armstrong);
        
    }
    
    public static int maxDigit(int num) {
        int maxDigit = 0;
        while (num > 0) {
            int remainder = num % 10;
            
            if (remainder > maxDigit) {
                maxDigit = remainder;
            }
            
            num -= remainder;
            num /= 10;
        }
        
        return maxDigit;
    }
    
    public static int reverseNum(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        
        return reversed;
    }
    
    public static boolean isPalindrome(int num) {
        int reversed = reverseNum(num);
        if (reversed == num) {
            return true;
        } else {
            return false;
        }
    } 
    
    public static int oddDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 1) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }
    
    public static int oneDigit(int num) {
        while (num >= 10) {
            num = oddDigitSum(num);
        }
        return num;
    }

    public static int deleteEven(int num) {
        int result = 0;
        int place = 1;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 1) {
                result += digit * place;
                place *= 10;
            }
            num /= 10;
        }
        return result;
    }
    
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int power(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            result *= base;
            exp--;
        }
        return result;
    }

    public static boolean isArmstrong(int num) {
        int n = countDigits(num);
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, n);
            temp /= 10;
        }
        return sum == num;
    }
        
    public static boolean isIncreasing(int num) {
        int prev = 10;
        while (num > 0) {
            int digit = num % 10;
    
            if (digit < prev) {
                prev = digit;
            } else {
                return false;
            }
    
            num /= 10;
        }
        return true;
    }
}



