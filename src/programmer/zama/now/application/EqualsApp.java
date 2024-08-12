package programmer.zama.now.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Aidil";
        first = first + "" + " Adam";

        System.out.println(first);

        String second = "Aidil Adam";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Aidil Adam";

        System.out.println(second == third);
        System.out.println(second.equals(third));

    }
}
