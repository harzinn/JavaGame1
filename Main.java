public class Main {
    public static void main(String[] args) {
    Ptest player = new Ptest("Harzinn");
    
    int target = 10;
    int attack;

    System.out.println();
    while (target > 0) {
        System.out.printf("\nCurrent target HP: %d", target);
        attack = player.pAttack();
        System.out.printf("\nYou attacked target for %d damage!", attack);
        target = target - attack;
        }
            System.out.println("\n\nTarget has been defeated");
    }
}