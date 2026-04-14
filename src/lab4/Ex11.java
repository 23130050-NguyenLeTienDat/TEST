package lab4;

import java.util.Arrays;
import java.util.Random;

public class Ex11 {
    public int[] subArray(int[] nums, int qty){
        Random rd = new Random();
        int[] res = new int[qty];
        if(qty> nums.length) return null;
        if(qty< nums.length){
            for(int i =0;i< qty;i++){
                int location = rd.nextInt(nums.length);
                res[i] = nums[location];
               nums = delete(nums,location);
            }
        }
        return res;
    }
    public int[] delete(int[] nums,int location){
        int[] res = new int[nums.length - 1];
        int k=0;
        for(int i =0; i< nums.length;i++){
            if(i == location){
                continue;
            }
            res[k] =nums[i];
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();
        int[] nums = {1,2,3,41,9,141,5,6,7,87};
        System.out.println(Arrays.toString(ex11.subArray(nums, 6)));
    }
}
