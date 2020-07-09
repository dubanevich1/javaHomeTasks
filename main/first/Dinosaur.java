package first;

public class Dinosaur {
    public static void main(String[] args){
        int kiloDino = 250;
        float tonnaDino = (float)kiloDino/1000;
        int grDino = kiloDino * 1000;
        int mgrDino = grDino * 1000;
        System.out.println("В динозаврике " + kiloDino + " кг");
        System.out.println("В динозаврике " + tonnaDino + " тонны");
        System.out.println("В динозаврике " + grDino + " грамм");
        System.out.println("В динозаврике " + mgrDino + " миллиграмм");
    }
}
