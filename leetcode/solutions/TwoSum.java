package leetcode.solutions;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 1, 2 };

        System.out.println(Arrays.toString(twoSum(nums, 3)));
    }

    public static int[] twoSum(int[] nums, int target) {
        short length = (short) nums.length;
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            int numsI = nums[i];
            if (numsMap.get(Integer.valueOf(target - numsI)) != null) {
                return new int[] { i, numsMap.get(Integer.valueOf(target - numsI)).intValue() };
            }
            numsMap.put(numsI, Integer.valueOf(i));
        }
        return null;
    }
}