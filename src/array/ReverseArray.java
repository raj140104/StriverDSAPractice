package array;

public class ReverseArray {

    static void reverseArray(int n, int[] arr){
        int l = 0;
        int r = n-1;

        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    static void main(String[] args) {
        int n = 4;
        int[] arr = {2, 1, 5, 6};
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
        System.out.println("After reverse");
        reverseArray(n, arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
    }
}
