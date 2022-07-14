import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        createCharacter(stdin);
        
        // Cleanup scanner
        stdin.close();
    }

    private static void createCharacter(Scanner stdin) {
        String userName;

        // Take username and create a character
        System.out.print("Please enter character name: ");
        userName = stdin.nextLine();

        Character player = new Character(userName); // Create new character object

        System.out.println(); // Add a blank line
        player.getStatus();   // Get character status
        System.out.println(); // Add a blank line
        System.out.println(); // Add a blank line
    }
}
