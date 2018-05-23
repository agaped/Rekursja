package CodingBat.Recursion2;

public class GroupSum6 {

    public boolean groupSum6(int start, int[] nums, int target) {
        if(start>=nums.length && target==0) return true;
        if(start>=nums.length && target!=0) return false;

        if(nums[start]==6) return groupSum6(start+1, nums, target-nums[start]);

        return groupSum6(start+1, nums, target-nums[start]) ||
                groupSum6(start+1, nums, target);
    }
}
