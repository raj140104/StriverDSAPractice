package recurssion;

public class SumParameter  {

    static void sumRe(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        sumRe(n-1, sum+n );

    }

    static void main(String[] args) {
        int n = 3;
        sumRe(n, 0);
    }
}
