import java.util.Scanner;

public class LibraryBookLoan {
    public static void main(String[] args) {

        // the user can get the book if one of these conditions are true:
        // is a student
        // lives near the library in a radius  of 3km max.

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a student? (true or false)");
        boolean isStudent = Boolean.parseBoolean(scan.nextLine());

        System.out.println("Do you live in a radius  of 3km? (true or false)");
        boolean livesNearHere = Boolean.parseBoolean(scan.nextLine());

        if (isStudent || livesNearHere){
            System.out.println("You can get the book");
        } else {
            System.out.println("Sorry");
        }

    }
}
