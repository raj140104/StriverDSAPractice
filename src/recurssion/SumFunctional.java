package recurssion;

public class SumFunctional {
    static int sumF(int n){
        if(n == 0){
            return 0;
        }
        return n + sumF(n-1);
    }

    static void main(String[] args) {
        int n = 3;

        System.out.println(sumF(n));
    }
}
