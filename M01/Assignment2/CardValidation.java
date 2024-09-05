import java.util.*;

public class CardValidation {

    public static boolean isValid(long number) {
        String num = String.valueOf(number);
        if (num.length() < 13 || num.length() > 16) {
            return false;
        } else if (prefixMatched(number, 4) || prefixMatched(number, 6) || prefixMatched(number, 5) || prefixMatched(number, 37)) {
            int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
            return total % 10 == 0;
        }
        return false;
    }


    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = String.valueOf(number);
        for (int i = num.length() - 2; i >= 0; i -= 2) {
            int digit = Integer.parseInt(num.substring(i, i + 1));
            int tempDig = digit + digit;
            int dig = getDigit(tempDig);
            sum += dig;
        }
        return sum;
    }


    public static int getDigit(int number) {
        if (getSize(number) > 1) {
            int digit1 = number % 10;
            int digit2 = number / 10;
            return digit1 + digit2;
        }
        return number;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String num = String.valueOf(number);
        for (int i = num.length() - 1; i >= 0; i -= 2) {
            int digit = Integer.parseInt(num.substring(i, i + 1));
            sum += digit;
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
        String num = String.valueOf(number);
        if (num.startsWith(String.valueOf(d))) {
            return true;
        }
        return false;
    }

    public static int getSize(long d) {
        String num = String.valueOf(d);
        return num.length();
    }


    public static long getPrefix(long number, int k) {
        if (getSize(number) < k) {
            return number;
        }
        String num = String.valueOf(number);
        return Long.parseLong(num.substring(0, k));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        String ccNum = in.next();
        System.out.println(ccNum + (isValid(Long.parseLong(ccNum)) ? " is valid." : " is invalid."));
    }

    
}