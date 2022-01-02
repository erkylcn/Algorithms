package leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

class Palindrome {

    public static void main(String... args) {
        System.out.println(isPalindrome(1000000000));
    }

    public static boolean isPalindrome(int y) {
        if (y < 0) {
            return false;
        }

        long x = (long) y;
        List<Long> digits = new ArrayList<>();
        long x10 = x * 10;
        for (long i = 10; i < x10 + 1; i = i * 10) {
            digits.add((x % i) / (i / 10));
        }

    
        int size = digits.size();
        int j = size - 1;
        for (int i = 0; j >=i; i++, j--) {
            //total = total + (i * digits.get(j));
            if(digits.get(i) != digits.get(j)){
                return false;
            }
        }

        return true;
    }
}