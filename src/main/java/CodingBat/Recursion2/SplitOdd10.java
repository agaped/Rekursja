package CodingBat.Recursion2;

public class SplitOdd10 {

    public boolean splitOdd10(int[] nums) {
        return helper(0,nums,0,0);

    }

    public boolean helper(int start, int[] nums, int group1, int group2){
        if(start>=nums.length && group1%10==0 && group2%2!=0) return true;
        if(start>=nums.length && group2%10==0 && group1%2!=0) return true;
        if(start>=nums.length && (group1%10!=0 ||group1%2==0)) return false;
        if(start>=nums.length && (group2%10!=0 ||group2%2==0)) return false;


        return helper(start+1, nums, group1,group2-nums[start]) ||
                helper(start+1, nums, group2,group1-nums[start]);
    }
}
