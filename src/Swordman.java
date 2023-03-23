public class Swordman extends Creature{
    public Swordman(String name, int level, int attack, int protection, int speed, int amount) {
        super("Swordman", 4, 10, 12, 5, 4);
    }

    @Override
    int getDamage() {
        return 0;
    }
}
