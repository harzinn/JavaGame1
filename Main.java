public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        System.out.println("D20 Test");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d: %2d  ", i, dice.d20());
        }

        System.out.println("\nD12 Test");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d: %2d  ", i, dice.d12());
        }

        System.out.println("\nD10 Test");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d: %2d  ", i, dice.d10());
        }

        System.out.println("\nD8 Test");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d: %2d  ", i, dice.d8());
        }

        System.out.println("\nD4 Test");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d: %2d  ", i, dice.d4());
        }
    }
}