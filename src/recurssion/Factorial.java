package recurssion;

public class Factorial {

    static int factRec(int i){
        if(i <= 1){
            return i;
        }
        int first = factRec(i-1);
        int sec = factRec(i-2);

        return first+sec;
    }

    static void main(String[] args) {
        int i = 3;
        System.out.println(factRec(i));
    }
}
//complesity of this is exponstial in nature = 2^n
