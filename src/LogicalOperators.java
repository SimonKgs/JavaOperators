public class LogicalOperators {
    public static void main(String[] args) {

        boolean a = true, b = false;

        // && only returns true if all expressions are true
        System.out.println("a &&  b " + ( a && b));
        System.out.println("a &&  a " + ( a && a));
        System.out.println("a && a && a && a && a " + ( a && a && a && a && a));
        System.out.println("a && a && a && a && b " + ( a && a && a && a && b));



        // || only returns false if all values are false
        System.out.println("a || b " + ( a || b));
        System.out.println("b || b " + ( b || b));
        System.out.println("a || a || a || a || a " + ( a || a || a || a || a));
        System.out.println("a || a || a || b || a " + ( a || a || a || b || a));
        System.out.println("b || b || b || b || b " + ( b || b || b || b || b));


        // ! not, it returns the contrary of the value
        System.out.println("not a " + (!a));
        System.out.println("not b " + (!b));

    }
}
