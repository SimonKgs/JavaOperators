import java.util.Scanner;

public class IsTheValueInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("INSERT A NUMBER");
        int number = Integer.parseInt(scan.nextLine());
        scan.close();
        if ( 0 <= number && number <= 5){
            System.out.println("the number is in range 0, 5");
        } else {
            System.out.println("the number is not in range 0, 5");
        }
    }
}
