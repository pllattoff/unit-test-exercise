public class Main {

    static void main() {

    }

    //Level 1 – Easy
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    //Level 2 – Medium
    //1
    public static String getFirstLetter(String text) {
        if (text == null || text.isBlank()) return null;
        return String.valueOf(text.charAt(0));
    }

    //2
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return (double) a / b;
    }

    //Level 3 – Bonus
    //1

    //2



    //TDD
    public static String fizzBuzz(int number) {

        return ""+number;
    }

}
