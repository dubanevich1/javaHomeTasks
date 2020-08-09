package second;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String command;


    System.out.println("Вы начинаете новую игру");
    Player player = new Player();

    while (player.getAlive()) {
        command = scanner.nextLine();
        switch (command) {
            case "Поставить блок": {
                player.putBlock();
                break;
            }
            case "Добыть блок": {
                player.getBlock();
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
            case "Выход":{
                System.exit(0);
                break;
            }
        }
    }

    }

}
