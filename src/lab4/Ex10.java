package lab4;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {
    public List<Integer> sortMToL(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i =0; i<nums.length -1;i++){
            for(int j = 0; j< nums.length -i-1;j++){
                int t=0;
                if(nums[j] > nums[j+1]){
                    t = nums[j];
                    nums[j] =nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
        for(int n : nums){
            res.add(n);
        }
        return  res;
    }
    public List<Integer> sortLToM(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i=nums.length; i>0;i--){
            for(int j= nums.length-i;j>0;j--){
                if(nums[j] >nums[j-1]){
                    int t = 0;
                    t =nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1]=t;
                }
            }
        }
        for(int n : nums){
            res.add(n);
        }
        return res;
    }

    public static void main(String[] args) {
        Ex10 ex10 = new Ex10();
        int[] nums = {1,-25,2,3,8,4};
        System.out.println(ex10.sortLToM(nums));
        System.out.println((ex10.sortMToL(nums)));

    }
}
