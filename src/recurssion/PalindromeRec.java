package recurssion;

import java.util.Arrays;

public class PalindromeRec {

    static boolean palin(String[] str, int i){
        int n = str.length;
        if(i >= n/2 ){
            return true;
        }
        if(str[i] != str[n-i-1]){
            return false;
        }
        return palin(str, i+1);
    }

    static void main(String[] args) {

        String[] s = {"MADAM"};
        boolean res = palin(s, 0);
        System.out.println(res);
        System.out.println();
        System.out.println();

    }
}
