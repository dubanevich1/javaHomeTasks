package first;

public class Reverse {
    public static void main(String[] args) {
        int a = 9843217;
        String str = "";

        for (int i = 0; i < 7; i++) {
            str += a % 10;
            a = a / 10;
        }

        a = Integer.parseInt(str.trim());
        System.out.println(a);
    }
}
