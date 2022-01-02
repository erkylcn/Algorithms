package leetcode.solutions;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {

        char[] tochararray = strs[0].toCharArray();

        boolean allContains = false;
        String prefix = "";
        String retPrefix = "";
        for (int i = 0; i < tochararray.length; i++) {
            prefix = prefix + String.valueOf(tochararray[i]);
            allContains = true;
            for (String str : strs) {
                if (!str.startsWith(prefix)) {
                    allContains = false;
                    break;
                }
            }

            if (!allContains) {
                break;
            } else {
                retPrefix = prefix;
            }
        }

        return retPrefix;
    }
}
