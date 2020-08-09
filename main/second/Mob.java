package second;

public class Mob {
    private int health;
    private int damage;
    private boolean isAlive;
    static int mobCount = 5;

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getDamage(){
        return health;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getMobCount(){
        return mobCount;
    }

    public void setMobCount(int mobCount){
        this.mobCount = mobCount;
    }

    public boolean getAlive(){
        return isAlive;
    }

    public void setAlive(boolean isAlive){
        this.isAlive = isAlive;
    }

    public Mob(){
        health = 50;
        damage = 10;
        isAlive = true;
    }
}
