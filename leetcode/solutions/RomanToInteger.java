package leetcode.solutions;

import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.romanToInt("III"));
    }

    public int romanToInt(String s) {
        HashMap<String, Integer> rules = new HashMap<>();
        
        rules.put(String.valueOf("I"), Integer.valueOf(1));
        rules.put(String.valueOf("V"), Integer.valueOf(5));
        rules.put(String.valueOf("X"), Integer.valueOf(10));
        rules.put(String.valueOf("L"), Integer.valueOf(50));
        rules.put(String.valueOf("C"), Integer.valueOf(100));
        rules.put(String.valueOf("D"), Integer.valueOf(500));
        rules.put(String.valueOf("M"), Integer.valueOf(1000));
        rules.put(String.valueOf("IV"), Integer.valueOf(4));
        rules.put(String.valueOf("IX"), Integer.valueOf(9));
        rules.put(String.valueOf("XL"), Integer.valueOf(40));
        rules.put(String.valueOf("XC"), Integer.valueOf(90));
        rules.put(String.valueOf("CD"), Integer.valueOf(400));
        rules.put(String.valueOf("CM"), Integer.valueOf(900));

        Integer total = 0;
        for (int i = 0; i < s.length();) {
            Integer v = null;
            if (i + 1 < s.length()){
                v = rules.get(s.substring(i, i+2));
            }
            if (v != null) {
                total = total + v;
                i = i + 2;
            } else {
                total = total + rules.get(s.substring(i, i+1));
                i = i + 1;
            }
        }
        return total;
    }
}