package first;

public class NumberComporator {
    public static void main(String[] args){
        int a = 2;
        int b = 1;
        int c = 1;
        if(a==b) {
            if (a == c) {
                System.out.println("Все числа равны");
            }
            else{System.out.println("a = b");}
        }
        else{
            if (a == c) { System.out.println("a = c");}
            else{
                if (b == c) {
                    System.out.println("b = c");
                }else{System.out.println("Все числа не равны");}
            }
        }
    }
}
