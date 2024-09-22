package M03.Assignment2;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter two rational numbers
        System.out.print("Enter the first rational number: ");
        BigInteger num1 = input.nextBigInteger();
        BigInteger den1 = input.nextBigInteger();
        Rational rat1 = new Rational(num1, den1);

        System.out.print("Enter the second rational number: ");
        BigInteger num2 = input.nextBigInteger();
        BigInteger den2 = input.nextBigInteger();
        Rational rat2 = new Rational(num2, den2);

        //display the results
        System.out.println(rat1 + " + " + rat2 + " = " + rat1.add(rat2));
        System.out.println(rat1 + " - " + rat2 + " = " + rat1.subtract(rat2));
        System.out.println(rat1 + " * " + rat2 + " = " + rat1.multiply(rat2));
        System.out.println(rat1 + " / " + rat2 + " = " + rat1.divide(rat2));
        System.out.println(rat2 + " is " + rat2.doubleValue());

        input.close();
    }
}
