import java.util.Scanner;

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        // P = (L + W) × 2
        // L * W
        Scanner scan = new Scanner(System.in);
        System.out.println("Calc the area and perimeter of a rectangle");
        System.out.println("Insert the length");
        int length = Integer.parseInt(scan.nextLine());
        System.out.println("Insert the width");
        int width = Integer.parseInt(scan.nextLine());

        System.out.println("The perimeter of this rectangle is: " + ((length + width) * 2));
        System.out.println("The area is: " + (length * width));

    }
}
