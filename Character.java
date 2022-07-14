public class Character {
    public String userName;
    public int health, mana;
    public String[] inventory;

    public Character(String userName) { // Character details
        this.userName = userName;
        this.health = 100;
        this.mana = 100;
        this.inventory = new String[100];
        this.inventory[0] = "Sword";
    }

    public void getStatus() {  // Get full character status
        System.out.printf("Character name: %s\n", userName);
        System.out.printf("Health: %d\n", health);
        System.out.printf("Mana:  %d\n", mana);
        System.out.printf("Inventory: ");
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                System.out.printf("%d:%s ", i + 1, inventory[i]);
            }
        }
    }
    
    public void takeDamage(int damage) { // Method to take damage
        health = health - damage;
    }

    public void healDamage(int heal) {  // Method to heal damage
        health = health + heal;
    }
}