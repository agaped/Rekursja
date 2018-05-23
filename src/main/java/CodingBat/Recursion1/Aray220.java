package CodingBat.Recursion1;

public class Aray220 {
    public boolean array220(int[] nums, int index) {
        if(index==nums.length || index+1==nums.length) return false;
        if(nums.length==1) return false;

        if(nums[index]*10==nums[index+1]) return true;
        return array220(nums, index+1);
    }
}
