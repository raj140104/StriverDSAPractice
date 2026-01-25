package math;

public class PalindromCheck {

    static boolean palindrom(int n){
        int org = n;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = (rev*10) + digit;
            n= n/10;

        }
        if(rev == org){
            return true;
        }
        return false;
    }

    static void main(String[] args) {
        int n = 11;
        System.out.println(palindrom(n));
    }
}
