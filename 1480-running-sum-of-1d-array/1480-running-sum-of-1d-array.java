class Solution {
    public int[] runningSum(int[] nums) {
        int[] list=new int[nums.length];
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            count+=nums[i];
            list[i]=count;
        }
        return list;
        
    }
}