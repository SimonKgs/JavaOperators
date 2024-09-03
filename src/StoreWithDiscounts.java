import java.util.Scanner;

public class StoreWithDiscounts {

    public static void main(String[] args) {

        // the program must ask for how many products a client buy and
        // if he/she is premium member, if both conditions are true it has the discount

        Scanner scan = new Scanner(System.in);

        System.out.println("How many products did you buy today?");
        int numberOfProducts = Integer.parseInt(scan.nextLine());

        System.out.println("Are you member of the store (true or false)?");
        boolean isMember = Boolean.parseBoolean(scan.nextLine());

        if (isMember && (numberOfProducts >= 10)){
            System.out.println("YOU HAVE THE PREMIUM DISCOUNT");
        } else if (!isMember && (numberOfProducts >= 10)) {
            System.out.println("SORRY IF YOU HAD BEEN A MEMBER, YOU WOULD HAVE RECEIVED A DISCOUNT");
        } else {
            System.out.println("NOT DISCOUNT FOR YOU");
        }

    }

}
