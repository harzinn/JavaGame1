public class Ptest {
    public String name;
    public int hp = 100;
    public int mp = 100;
    public int ac = 15;

public Ptest(String name) {
    this.name = name;
}

public int pAttack() {
    Dice dice = new Dice();
    return dice.d8();
}
}