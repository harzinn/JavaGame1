import java.util.*;

public class Main {
    public static void main(String[] args) {
    Ptest player = new Ptest("Player 1"); // Initialize Player 1
    Scanner stdin = new Scanner(System.in); // Scanner for taking user input

    String monsterName; 
    int monsterHealth, monsterCount, attack; 

    System.out.print("What kind of monster are you fighting?: ");
    monsterName = stdin.nextLine();
    System.out.print("How much health points should the monster have?: ");
    monsterHealth = stdin.nextInt();
    System.out.print("Finally, how many monsters do you wish to fight?: ");
    monsterCount = stdin.nextInt();

    Mtest[] monster = new Mtest[monsterCount];

    for (int i = 0; i < monsterCount; i++) {
        monster[i] = new Mtest(monsterName + " " + (i + 1), monsterHealth);
    
    }
    
    for (int i = 0; i < monsterCount; i++) {
        System.out.println();
        while (monster[i].health > 0) {
            System.out.printf("\n%s's HP: %d",monster[i].name, monster[i].health);
            attack = player.pAttack();
            System.out.printf("\nYou attacked %s for %d damage!", monster[i].name, attack);
            monster[i].health = monster[i].health - attack;
            }
                System.out.printf("\n%s has been defeated", monster[i].name);
                monster[i] = null;
    }

    // Scanner cleanup
    stdin.close();

    } 
}