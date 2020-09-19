package second;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Вы начинаете новую игру");
        Player player = new Player();

        //переменные не используются. Достаточно написать new Mob("Скелет")
        Mob skelet = new Mob("Скелет");
        Mob zombie = new Mob("Зомби");
        Mob pavyk = new Mob("Павук");
        Mob gnom = new Mob("Гном");

        while (player.getAlive()) {
            System.out.println("ХР" +
                    "" +
                    " " + player.getHealth() + "\nЕХР " + player.getExp()
                    + "\nБлоков " + player.getBlockCount() + "\nМобов на карте:" + Mob.mobList.size());
            command = scanner.nextLine();
            switch (command) {
                case "Поставить блок": {
                    player.putBlock();
                    break;
                }
                case "Добыть блок": {
                    player.raiseBlock();
                    break;
                }
                case "Кушать": {
                    player.eat();
                    break;
                }
                case "Убить моба": {
                    player.fight();
                    break;
                }
                case "Помощь": {
                    System.out.println(" - Добыть блок \n - Поставить блок \n - Кушать \n - Убить моба ");
                    break;
                }
                case "Выход": {
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Неизвестная комманда");
                }
            }
        }
    }
}
