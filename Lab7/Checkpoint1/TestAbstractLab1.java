import java.util.Scanner;
public class TestAbstractLab1 {
                
        public static void main(String[] args) {
            Scanner Input = new Scanner(System.in);
            System.out.println("Enter three sides : ");
                double side1 = Input.nextDouble();
                double side2 = Input.nextDouble();
                double side3 = Input.nextDouble();
                
            System.out.println("Enter the color : ");
                String color = Input.next();
                
            System.out.println("Enter a boolean value for filled : ");
                boolean filled = Input.nextBoolean();
                
        GeometricObject result = new TTriangle(side1 , side2 , side3,color,filled);
            System.out.println("The area is : " + result.getArea());
            System.out.println("The perimeter is : " + result.getPerimeter());
            System.out.println("The new Triangle = side 1 : " + side1 + " side 2 : " + side2 + " side 3 : " + side3);
    }
}
