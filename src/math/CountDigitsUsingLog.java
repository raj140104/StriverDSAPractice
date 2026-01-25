package math;


public class CountDigitsUsingLog {

    static int countDigit(int n){

        if(n == 0) return 1;
        int count = (int) (Math.log10(n)+1);
        return  count;
    }

    static void main(String[] args) {

       int a = 5989588;
        System.out.println("count of the digit: " + countDigit(a));
    }
}
