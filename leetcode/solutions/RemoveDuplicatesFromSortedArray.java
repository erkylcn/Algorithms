package leetcode.solutions;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
       int[] nums = new int[]{1,1,1,2,2,3,3,3};
       System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
       System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int current = Integer.MIN_VALUE;

        for(;i<nums.length;i++){
            if(current == Integer.MIN_VALUE){
                current = nums[i];
                nums[j] = current;
                j++;
                continue;
            }
            
            if(current == nums[i]){
                continue;
            } 
            else{
                current = nums[i];
                nums[j] = current;
                j++;
            }
        }

        return j;
    }
}