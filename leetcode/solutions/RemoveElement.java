package leetcode.solutions;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int [] nums = {3,2,2,3};
        int k = new RemoveElement().removeElement(nums, 3);

        System.out.println("k: "+ k + " " + Arrays.toString(nums));
    }


    public int removeElement(int[] nums, int val) {
    
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            int numsI = nums[i];
            if(numsI != val){
                nums[j] = numsI;
                j++;
            }
        }
        return j;
    }
}
