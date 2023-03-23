public class Griffin extends Creature{
    public Griffin(String name, int level, int attack, int protection, int speed, int amount) {
        super("Griffin", 3, 8, 8, 6, 7);
    }

    @Override
    int getDamage() {
        return 0;
    }
}
