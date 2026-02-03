package math;

public class GCD {

    static int findGCD(int n, int n1){
        int gcd =0;
        for(int i = 1; i<=Math.min(n, n1); i++){
            if(n%i==0 && n1%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    static void main(String[] args) {
        System.out.println(findGCD(9,8));
    }
}
