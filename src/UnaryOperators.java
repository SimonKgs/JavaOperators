public class UnaryOperators {

    public static void main(String[] args) {
        int a = 3, b = -2;

        // +
        System.out.println("+a " + +a);
        System.out.println("-a " + -a);

        // increment, decrement
        System.out.println("Increment");
        System.out.println("++a " + ++a); // pre increment
        System.out.println("a++ " + a++); // post increment
        System.out.println("a " + a);

        System.out.println("Decrement");
        System.out.println("--b " + --b); // pre decrement
        System.out.println("b-- " + b--); // post decrement
        System.out.println("b " + b);
    }
}
