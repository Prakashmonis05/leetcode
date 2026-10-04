class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]>0)
        {
            return -1;
        }
        int left=0;
        int right=nums.length-1;
        int r;
        int l;


        while(left<right)
        {    
            if(nums[left]<0)
            {
                l=Math.abs(nums[left]);
                r=nums[right];
                if(l==r)
                {
                    return r;
                }
                else if(l>r)
                {
                    left++;
                }
                else if(l<r)
                {
                    right--;
                }
            }
            else
            {
                return -1;
            }
        }
        return -1;
    }
}