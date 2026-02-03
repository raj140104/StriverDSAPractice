package math;

public class EuclidianAlgo {
// TO find GCD/HCF of two number
    static int findGCD(int a, int b){

        while(a > 0 && b>0){
            if(a>b){
                a = a%b;
            }
            else b = b%a;
        }
        if(a==0)
           return b;
        return a;
    }

    static void main(String[] args) {
        System.out.println(findGCD(24,12));
    }
}
