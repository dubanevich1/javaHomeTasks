package first;

public class RingRadius {

    public static void main(String[] args) {
        float R1 = 50f; //лучше всегда использовать double
        float R2 = 30f; //название переменных всегда с маленькой буквы

        float pi = (float) Math.PI;
        float S = R1 * pi - R2 * pi;

        System.out.println(S);
    }
}
