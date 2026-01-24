package recurssion;

public class countBacktracking {

    static void counting(int i, int n){
        if(i<1){
            return;
        }
        counting(i-1, n);
        System.out.println(i);
    }

    static void main(String[] args) {
        int n = 5;
        counting(n,n);
    }
}
