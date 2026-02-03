package math;

public class Factorial {

//    static void findFactorial(int n){
//        for(int i = 1; i<=n; i++){
//            if(n % i == 0){
//                System.out.print(i + " ");
//            }
//        }
//    }
    //optimized soln
    static void findFactorial(int n){
        for(int i = 1; i<=(int)Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.print(i + " ");
                if(n/i != i){
                    System.out.print(n/i+ " ");
                }
            }

        }
    }
    static void main(String[] args) {
        findFactorial(36);
    }
}
