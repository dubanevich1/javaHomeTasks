package first;

public class NumberComporator {

    public static void main(String[] args) {
        //Желательно, чтобы пользователь вводил значения через System.in (см. презентацию)
        int a = 3;
        int b = 2;
        int c = 1; //Разбил на логические блоки

        if (a == b) {
            if (a == c) {
                System.out.println("Все числа равны");
            } else { //Всё равно нужен перенос. За скобочки плюсик.
                System.out.println("a = b");
            }
        } else { // не забывай пробелы после операторов
            if (a == c) {
                System.out.println("a = c");
            } else {
                if (b == c) {
                    System.out.println("b = c");
                } else {
                    System.out.println("Все числа не равны");
                }
            }
        }
    }
}
