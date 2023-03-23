public class Pikeman extends Creature {


    public Pikeman(String name, int level, int attack, int protection, int speed, int amount) {
        super("Pikeman", 1, 4, 5, 4, 14);
    }

    @Override
    int getDamage() {
        return 0;
    }
}
