package recurssion;

public class RevArray{

    static void reverseArray(int i, int arr[]){
        int n = arr.length;
        if(i >= n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverseArray(i+1, arr);
    }

    static void main(String[] args) {
        int[] array = {5, 6, 2, 6, 9};

        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        System.out.println("Reverse array using recurssion");
        reverseArray(0, array);
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
        }
    }

}