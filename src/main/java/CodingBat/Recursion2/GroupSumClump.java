package CodingBat.Recursion2;

public class GroupSumClump {

    public boolean groupSumClump(int start, int[] nums, int target) {
        if(start>=nums.length && target==0) return true;
        if(start>=nums.length && target!=0) return false;

        int identical=0;
        for(identical=1; identical<nums.length; identical++){
            if(nums[identical]!=nums[identical+1]) break;
        }

        return groupSumClump(start+identical, nums, target-nums[start]) ||
                groupSumClump(start+1, nums, target);
    }

}
