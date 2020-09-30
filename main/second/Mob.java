package second;

import java.util.ArrayList;

public class Mob extends Entity {
    private String name;
    static ArrayList<Mob> mobList = new ArrayList<>();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Mob(String name){
        this.name = name;
        this.setHealth((int)(Math.random() * 101) + 20);
        this.setDamage((int)(Math.random() * 11) + 5);
        this.setAlive(true);
        mobList.add(this);
    }
}
