package second;

public class Player extends Entity {

    private int blockCount;
    private int exp;

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


    public Player() {
        this.setHealth(100);
        this.setDamage(30);
        blockCount = 10;
        exp = 0;
        this.setAlive(true);
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
        this.setHealth( this.getHealth() + 10);
    }

    public void fight() {
        if (Mob.mobList.isEmpty()) {
            System.out.println("Противников нет, карта чиста");
            return;
        }
        Mob mob = Mob.mobList.get((int) (Math.random() * Mob.mobList.size()));
        while (mob.getAlive()) {
            System.out.println("Вы наносите " + mob.getName() + " " + this.getDamage() + " урона и получаете урон в размере " + mob.getDamage() + " едениц");
            mob.setHealth(mob.getHealth() - this.getDamage());
            this.setHealth(this.getHealth() - mob.getDamage());
            if (mob.getHealth() <= 0) {
                mob.setAlive(false);
                exp += 20;
                System.out.println("Получено 20 опыта");
            }
            if (this.getHealth() <= 0) {
                this.setAlive(false);
                System.out.println("Вы умерли в бою");
                return;
            }
        }
        Mob.mobList.remove(mob);
        System.out.println("Моб мертв");

    }
}

