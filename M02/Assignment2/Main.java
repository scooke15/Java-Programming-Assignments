package M02.Assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double s1 = 1.0 , s2 = 1.0, s3 = 1.0;
        String filled = "";
        Scanner in = new Scanner(System.in);

        //set sides & create triangle
        s1 = getValidDoubleInput(in, "Please enter the length for side 1: ");
        s2 = getValidDoubleInput(in, "Please enter the length for side 2: ");
        s3 = getValidDoubleInput(in, "Please enter the length for side 3: ");

        Triangle triangle = new Triangle(s1, s2, s3);

        //set color
        System.out.println("Please enter the color you would like");
        triangle.setColor(in.next());

        //set filled
        System.out.println("is the triangle filled?");
        while (!filled.equals("yes") && !filled.equals("no")){
            System.out.println("please enter \"yes\" or \"no\" ");
            filled = in.next();
            filled = filled.toLowerCase();
        }
        if(filled.equals("yes")){
            triangle.setFilled(true);
        }
        if(filled.equals("no")){
            triangle.setFilled(false);
        }

        System.out.println("your triangle details: \n perimeter: " + triangle.getPerimeter() + "\n area: " + triangle.getArea() + "\n color: " + triangle.getColor() + "\n filled: " + triangle.isFilled());
        

        in.close();
    }

/*  // method to handle valid input for each side
    (i used chatgpt to help me create a reusable function for each double
    input, though not a neccessary inclusion for the assignment i think it's good practice to include validation so
    I'd appreciate any feedback on this as well if it could be better!) 
    */
    public static double getValidDoubleInput(Scanner in, String prompt) {
        double value = 0;
        boolean validInput = false;
    
        while (!validInput) {
            try {
                System.out.print(prompt);
                value = in.nextDouble();
                validInput = true; 
            } catch (InputMismatchException e) {
                System.out.println("You entered something that's not a number. Try again.");
                in.next(); // Consume the invalid input (added by chatgpt to get it working right)
            }
        }
    
        return value;
    }
    
}
