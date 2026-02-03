package math;

public class PrimeNo {

    static boolean findPrimeNo(int n){
        int count = 0;
        if(n <= 2){
            return false;
        }
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                count += 1;
                if(n/i != i){
                    count +=1;
                }
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }

    static void main(String[] args) {
        System.out.println(findPrimeNo(3));
    }
}
