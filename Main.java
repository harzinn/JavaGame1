public class Main {
    public static void main(String[] args) {
    Dice dice = new Dice();
    Ptest player = new Ptest("Harzinn");
    Mtest monster = new Mtest("Goblin", (dice.d8() + 4));
    
    int attack;

    System.out.println();
    while (monster.health > 0) {
        System.out.printf("\n%s's HP: %d",monster.name, monster.health);
        attack = player.pAttack();
        System.out.printf("\nYou attacked %s for %d damage!", monster.name, attack);
        monster.health = monster.health - attack;
        }
            System.out.printf("\n%s has been defeated", monster.name);
    }
}