package math;

public class reverseDigit {

    static int reverseN(int n){
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = (rev*10) + digit;
            n = n/10;
        }
        return rev;
    }

    static void main(String[] args) {
        int n = 679090909;
        System.out.println(reverseN(n));
    }
}
