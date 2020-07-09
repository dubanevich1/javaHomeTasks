package first;

public class WithoutVariables {

    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        a += b;
        b = a - b;
        a -= b;

        System.out.println(a);
        System.out.println(b);
    }
}
