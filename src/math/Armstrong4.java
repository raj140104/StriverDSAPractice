package math;

public class Armstrong4 {
    static boolean findArmstrong(int n){
        int org = n;
        int sum = 0;
        int pow = 0;
        //count digits - for power

        while(n>0) {
            pow++;
            n = n / 10;
        }
        //check armstrong
        int temp = org;
            while(temp>0){
            int digit = temp%10;
            sum = sum + (int)Math.pow(digit, pow);
            temp = temp/10;
        }
            if(org == sum){
                return true;
            }
            return false;
    }

    static void main(String[] args) {
        int n = 371;
        System.out.println(findArmstrong(n));
    }
}
