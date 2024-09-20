
public class Main {

    public static void main(String[] args){
        //create test circles
        Circle circle1 = new Circle(8.0);
        Circle circle2 = new Circle(10.0);
        Circle circle3 = new Circle(10.0);

        // next line should return -1 because c1 < c2
        System.out.println(circle1.compareTo(circle2));

        //next line should return 1 because c2 > c1
        System.out.println(circle2.compareTo(circle1));

        //next line should return 0 because c2 = c3
        System.out.println(circle2.compareTo(circle3));

        //true
        System.out.println(circle2.equals(circle3));

        //false
        System.out.println(circle1.equals(circle3));
    }
    
}
