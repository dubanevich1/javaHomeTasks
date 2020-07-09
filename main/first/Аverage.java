package first;

public class Аverage {

    public static void main(String[] args) {
        int a = 984321;
        int[] mass = new int[6];
        int summ = 0;
        int prois = 1;

        for (int i = 0; i < 6; i++) {
            mass[i] = a % 10;
            a = a / 10;
            summ += mass[i];
            prois *= mass[i];
        }

        double srA = (double) summ / 6;
        double srG = Math.pow(prois, 1.0 / 6); //приведение не нужно

        System.out.println(srA);
        System.out.println(srG);
    }
}
