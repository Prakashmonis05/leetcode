class Solution {
   
    public int findleft(int[] nums, int target)
    {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int ans=-1;


        while(left<=right)
        {
            int mid=left+(right-left)/2;
            
            if(nums[mid]==target)
            {
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return ans;
    }

    public int findright(int[] nums,int target)
    {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int ans=-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]==target)
            {
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int left=findleft(nums,target);

        int right=findright(nums,target);

        return new int[]{left,right};
    }
}