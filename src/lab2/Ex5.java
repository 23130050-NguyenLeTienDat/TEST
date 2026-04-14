package lab2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex5 {
    public boolean isPrime(int n){
        if(n <2) return false;
        for(int i =2; i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int[] print(int a, int b){
        int[] res = new int[b];
        int count=0;
        int m = a+1;
        while(count<b){
            if(isPrime(m)) {
                res[count] = m;
                count++;
            }
            m++;
        }
        return res;
    }

    public static void main(String[] args) {
        Ex5 ex5 = new Ex5();
        System.out.println(Arrays.toString(ex5.print(15,5)) );
    }

}
