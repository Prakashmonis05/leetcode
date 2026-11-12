class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;

        if(n==1)
        {
            return nums[0];
        }

        int min=nums[0];

        int left=0;

        int right=n-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]<min)
            {
                min=nums[mid];
            }

            else if(nums[left]<=nums[mid])
            {
                if(nums[left]>=min)
                {
                    left=mid+1;
                }
                else
                {
                    min=nums[left];
                    left=mid+1;
                }
            }
            else
            {
                if(nums[mid]>=min)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
        }
        return min;
    }
}