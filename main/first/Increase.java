package first;

public class Increase {

    public static void main(String[] args) {
        //System.in
        int a = 4321;
        boolean isMore = true;
        boolean isLess = true;
        int[] mass = new int[4]; //Блоки видны. Плюсик

        for (int i = 0; i < mass.length; i++) { //mass.length логичнее, чем просто 4.
            mass[i] = a % 10;
            a = a / 10;
        }

        for (int i = 1; i < 4; i++) {
            if (!(mass[i] < mass[i - 1])) { //лишнее действие
                isMore = false; //по умолчанию true
                break;
            }
        }

        for (int i = 1; i < 4; i++) {
            if (!(mass[i] > mass[i - 1])) { //лишнее действие
                isLess = false; // по умолчанию и было true
                break;
            }
        }

        if (isMore) { //Отлично, что не делала isMore == true
            System.out.println("По возрастанию");
        } else {
            if (isLess) {
                System.out.println("По убыванию");
            } else {
                System.out.println("Ни по возрастанию, ни по убыванию");
            }
        }
    }
}
