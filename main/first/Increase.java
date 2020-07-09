package first;

public class Increase {
    public static void main(String[] args) {
        int a = 4321;
        boolean isMore = true;
        boolean isLess = true;
        int[] mass = new int[4];

        for (int i = 0; i < 4; i++) {
            mass[i] = a % 10;
            a = a / 10;
        }

        for (int i = 1; i < 4; i++) {
           if((mass[i] < mass[i-1]) && (mass[i] != mass[i-1])){
            isMore = true;
           }else{ isMore = false; break;}
        }

        for (int i = 1; i < 4; i++) {
            if((mass[i] > mass[i-1]) && (mass[i] != mass[i-1])){
            isLess = true;
           }else{ isLess = false; break;}
        }

        if(isMore){System.out.println("По возрастанию");}
        else{
            if(isLess) {System.out.println("По убыванию");}
            else{System.out.println("Ни по возрастанию, ни по убыванию"); }
        }

    }
}
