public class Angel extends Creature{
    public Angel(String name, int level, int attack, int protection, int speed, int amount) {
        super("Angel", 7, 20, 20, 12, 1);
    }

    @Override
    int getDamage() {
        return 0;
    }
}
