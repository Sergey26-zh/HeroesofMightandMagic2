public abstract class Creature {
    private String name;
    private int level;
    private int attack;
    private int protection;
    private int speed;
    private int amount;

    public Creature(String name, int level, int attack, int protection, int speed, int amount) {
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.protection = protection;
        this.speed = speed;
        this.amount = amount;
    }

    abstract int getDamage();

   /* public String getName() { return name; }

    public int getLevel() { return level; }

    public int getAttack() { return attack; }

    public int getProtection() { return protection; }

    public int getSpeed() { return speed; }

    public int getAmount() { return amount; }

    public void setName(String name) { this.name = name; }

    public void setLevel(int level) { this.level = level; }

    public void setAttack(int attack) { this.attack = attack; }

    public void setProtection(int protection) { this.protection = protection; }

    public void setSpeed(int speed) { this.speed = speed; }

    public void setAmount(int amount) { this.amount = amount; }*/
}
