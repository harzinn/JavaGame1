import java.util.*;

public class Dice { // Simulate Dice Rolls
    public Random rand = new Random();

    public int d4() { // Simulate d4 roll
        return (rand.nextInt(4) + 1);
    }

    public int d8() { // Simulate d8 roll
        return (rand.nextInt(8) + 1);
    }

    public int d10() { // Simulate d10 roll
        return (rand.nextInt(10) + 1);
    }

    public int d12() { // Simulate d12 roll
        return (rand.nextInt(12) + 1);
    }

    public int d20() { // Simultea d20 roll
        return (rand.nextInt(20) + 1);
    }
}