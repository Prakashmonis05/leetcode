class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {   
            int result=0;
            int res=nums[i];
            while (res>0)
            {
                result+=res%10;
                res=res/10;
            }
            if(result==i)
            {
                return i;
            }
        }
       return -1;
    }
}