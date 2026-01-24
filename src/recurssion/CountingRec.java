package recurssion;

public class CountingRec {

    static void counting(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        counting(i+1, n);
    }

    static void main(String[] args) {
        int n = 10;
        int i = 1;
        counting(i, n);
    }
}
