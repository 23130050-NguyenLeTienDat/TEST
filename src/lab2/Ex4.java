package lab2;

import java.util.Arrays;

public class Ex4 {
    // cong 2 mang cung lenght
    public int[] arrayPlus(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];
        for(int i =0; i< arr1.length;i++){
                result[i] = arr1[i]+arr2[i];
        }
        return result;
    }
    // cong tu ben trai 2 mang khac lenght

    public int[] arrayPlusss(int[] arr1, int[] arr2){
        //so sanhs lenght cua ma tran nao lon hon
        int lg = Math.max(arr1.length,arr2.length);
        int[] res = new int[lg];
        for(int i = 0; i< res.length; i++){
            //neu i < length ma tran 1  thi gia tri cua val1 la gia tri cua arr1[i] khong thi bang 0;
            int val1 = (i<arr1.length) ?arr1[i]: 0;
            //neu i < length ma tran 1  thi gia tri cua val1 la gia tri cua arr1[i] khong thi bang 0;
            int val2 = (i<arr2.length)? arr2[i]:0;
            res[i] = val1+val2;
        }
        return res;
    }
    // cong tu ben phai qua
    public int[] arrayPlussss(int[] arr1, int[] arr2){
        int i = arr1.length-1;
        int j = arr2.length-1;
        int lg = Math.max(arr1.length,arr2.length);
        int[] res = new int[lg];
        int k = lg-1;
        while(k>=0){
            int val1 = (i>=0) ?arr1[i]:0;
            int val2 = (j>=0) ?arr2[j]:0;
            res[k] = val1 + val2;
            i--;
            j--;
            k--;
        }
        return res;
    }
// cong tu ben trai nhung cui hon
        public int[] arrayPluss(int[] arr1, int[] arr2){
        int lg = Math.max(arr1.length,arr2.length);
        int[] res = new int[lg];
        for(int i = 0; i< res.length;i++){
           if(i< arr1.length  && i<arr2.length) {
               res[i] = arr1[i] + arr2[i];
           }else if(i< arr1.length  && i>arr2.length){
               res[i] = arr1[i];
           }else if(i< arr2.length  && i>arr1.length){
               res[i] = arr2[i];
           }
        }
        return res;
    }

    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();
        int[] arr1 = {1,1,2,3,4};
        int[] arr2 = {5,1,2,7,9};
        int[] arr3 = {1,2,3,4,5,6,7,8,9};
        System.out.println("Cong 2 mang cung length");
        System.out.println(Arrays.toString(ex4.arrayPlus(arr1,arr2)));
        System.out.println("cong 2 mang khac length trai --> phai");
        System.out.println(Arrays.toString(ex4.arrayPlusss(arr1,arr3)));
        System.out.println("cong 2 mang khac length trai --> phai nhung cui hon");
        System.out.println(Arrays.toString(ex4.arrayPluss(arr1,arr3)));
        System.out.println("cong 2 mang khac length phai --> trai");

        System.out.println(Arrays.toString(ex4.arrayPlussss(arr1,arr3)));


    }
}
