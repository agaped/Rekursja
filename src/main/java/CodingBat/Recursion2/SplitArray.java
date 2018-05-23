package CodingBat.Recursion2;

public class SplitArray {

    public boolean splitArray(int[] nums) {
        return helper(0,nums,0,0);

    }

    public boolean helper(int start, int[] nums, int group1, int group2){
        if(start>=nums.length && group1==group2) return true;
        if(start>=nums.length && group1!=group2) return false;

        return helper(start+1, nums, group1,group2-nums[start]) ||
                helper(start+1, nums, group2,group1-nums[start]);
    }
}
