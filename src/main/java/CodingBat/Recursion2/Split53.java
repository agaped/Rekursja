package CodingBat.Recursion2;

public class Split53 {

    public boolean split53(int[] nums) {
        return helper(0,nums,0,0);

    }

    public boolean helper(int start, int[] nums, int group1, int group2){
        if(start>=nums.length && group1==group2) return true;
        if(start>=nums.length && group1!=group2) return false;

        if(nums[start]%5==0) return helper(start+1, nums, group1,group2-nums[start]) ||
                helper(start+1, nums, group1, group2-nums[start]);

        if(nums[start]%3==0 && nums[start]%5!=0) return helper(start+1, nums, group1-nums[start],group2) ||
                helper(start+1, nums, group1-nums[start], group2);

        return helper(start+1, nums, group1,group2-nums[start]) ||
                helper(start+1, nums, group1-nums[start], group2);

    }
}
