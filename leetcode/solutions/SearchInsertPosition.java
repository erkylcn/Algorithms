package leetcode.solutions;

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int [] {1,2,3,5,6,7,8,9,10,11,12,13,14,15,16}, 4));
    }


    public int searchInsert(int[] nums, int target) {
        
        int length = nums.length;

        if(target > nums[length -1]){
            return length;
        }
        if(target < nums[0]){
            return 0;
        }

        int i = 0;
 
        while(true){
            i = (i + length ) / 2; // log(n)

            int numsI = nums[i];
            if(target < numsI){
                if(target > nums[i-1]){ //found at this index
                    break;
                }
                else if(target == nums[i-1]){ //found at index - 1 
                    i=i-1;
                    break;
                }

                length = i + 1;//less left side of the array
                i = 0;
            }
            else if(target == numsI){ //found
                break;
            }
        }
        return i;
    }
}
