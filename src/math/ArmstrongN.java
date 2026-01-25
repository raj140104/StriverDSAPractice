package math;

import com.sun.source.tree.BreakTree;

public class ArmstrongN {
    static boolean findArmstrongNumber(int n){
        int org = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + (digit*digit*digit);
            n = n/10;
        }
        if(sum == org) {
            return true;
        }
        return false;
    }

    static void main(String[] args) {
        int n = 371; //1634; - this will only work for the 3digit not for the four digit
        System.out.println(findArmstrongNumber(n));
    }
}
