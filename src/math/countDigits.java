package math;

public class countDigits {

    static int count(int n){
//        int a = n;
        int count = 0;
        if(n==0)return 1;
        while(n!=0){
//            int digit = n%10;
            count++;
            n = n/10;
        }
        return count;

    }

    static void main(String[] args) {
        int n = 1323;
        System.out.println(count(n));
    }
}
