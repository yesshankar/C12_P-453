/**
 * Created by Shankar on 11/5/2016.
 */
public class Solution {
    public int minMoves(int[] nums){
        int count = 0;
        int maxNumIndex;

        while (!isAllEqual(nums)){
            maxNumIndex = maxNumIndex(nums);
            increment(nums,maxNumIndex);
            count++;
        }

        return count;
    }

    public boolean isAllEqual(int[] nums){
        int arrSize = nums.length;

        for (int i = 0; i < arrSize; i++) {
            if(nums[0] != nums[i])
                return false;
        }
        return true;
    }

    public int maxNumIndex(int[] nums){
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[0])
                max = i;
        }

        return max;
    }

    public void increment(int[] nums, int except){
        for (int i = 0; i < nums.length; i++) {
            if(i != except)
                nums[i] = nums[i] + 1;
        }
    }
}
