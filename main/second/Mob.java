package second;

import java.util.ArrayList;

public class Mob {
    private String name;
    private int health;
    private int damage;
    private boolean isAlive;
    static ArrayList<Mob> mobList = new ArrayList<>();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public boolean getAlive(){ //метод назвать isAlive
        return isAlive;
    }

    public void setAlive(boolean isAlive){
        this.isAlive = isAlive;
    }

    public Mob(String name){
        this.name = name;
        health = (int)(Math.random() * 101) + 20;
        damage = (int)(Math.random() * 11) + 5;
        isAlive = true;
        mobList.add(this);
    }
}
