package second;

public class Player {
    private int health;
    private int damage;
    private int blockCount;
    private int exp;
    private boolean isAlive;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
    }

    public boolean getAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Player() {
        health = 100;
        damage = 30;
        blockCount = 10;
        exp = 0;
        isAlive = true;
    }

    public Player(int health, int damage, int blockCount, int exp, boolean isAlive) {

        Player player = new Player(100, 30, 10, 0, true);
    }

    public void putBlock() {
        if (blockCount > 0) {
            blockCount--;
            System.out.println("Блок поставлен");
        } else {
            System.out.println("Недостаточно блоков");
        }
    }

    public void raiseBlock() {
        System.out.println("Вы добыли блок");
        blockCount++;
    }

    public void eat() {
        System.out.println("Восстановлено 10хп");
        health += 10;
    }

    public void fight() {
        if (Mob.mobList.isEmpty()) {
            System.out.println("Противников нет, карта чиста");
            return;
        }
        Mob mob = Mob.mobList.get((int) (Math.random() * Mob.mobList.size()));
        while (mob.getAlive()) {
            System.out.println("Вы наносите " + mob.getName() + " " + damage + " урона и получаете урон в размере " + mob.getDamage() + " едениц");
            mob.setHealth(mob.getHealth() - damage);
            health -= mob.getDamage();
            if (mob.getHealth() <= 0) {
                mob.setAlive(false);
                exp += 20;
                System.out.println("Получено 20 опыта");
            }
            if (health <= 0) {
                isAlive = false;
                System.out.println("Вы умерли в бою");
                return;
            }
        }
        Mob.mobList.remove(mob);
        System.out.println("Моб мертв");

    }
}

