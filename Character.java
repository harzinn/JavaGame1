public class Character {
    public String userName;
    public int health, mana;
    public String[] inventory;

    public Character(){};

    public Character(String userName, int health, int mana) {
        this.userName = userName;
        this.health = health;
        this.mana = mana;
        this.inventory = new String[100];
        this.inventory[0] = "Torch";
        this.inventory[1] = "Momento";
    }

    public void getStatus() {
        System.out.printf("Character name: %s\n", userName);
        System.out.printf("Health: %d\n", health);
        System.out.printf("Mana:  %d\n", mana);
        System.out.printf("Inventory: ");
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                System.out.printf("%s, ", inventory[i]);
            }
        }
    }
}