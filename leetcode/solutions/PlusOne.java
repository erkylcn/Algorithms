package leetcode.solutions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[] { 1,2,3 })));
    }

    public int[] plusOne(int[] digits) {
        int increment = 1;
        for (int i = digits.length - 1; i > -1; i--) {
            int digitsI = digits[i];
            if (digitsI + increment > 9) {
                digits[i] = (digitsI + increment) % 10;
                increment = 1;
            } 
            else {
                digits[i] = digitsI + increment;
                increment = 0;
            }
        }

        int[] ret;
        if (increment == 1) { // new array
            ret = new int[digits.length + 1];
            ret[0] = 1; // first element equals 1
            for (int i = 1; i < digits.length; i++)
                ret[i] = digits[i-1];
        } 
        else {
            ret = digits;
        }

        return ret;
    }
}
