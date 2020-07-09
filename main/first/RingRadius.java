package first;

public class RingRadius {
    public static void main(String[] args){
        float R1 = 50f;
        float R2 = 30f;
        float pi = (float)Math.PI;
        float S = R1 * pi - R2 * pi;
        System.out.println(S);
    }
}
