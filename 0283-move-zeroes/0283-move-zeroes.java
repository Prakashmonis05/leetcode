class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=1;
       
       while(i<n && j<n)
       {
            if(nums[i]==0 && nums[j]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            

            if(n>i && nums[i]!=0)
            {
                i++;
                {
                    if(j<i)
                    {
                        j=i+1;
                    }
                }
            }

            if(n>j && nums[j]==0)
            {
                j++;
            }

       }
        
    }
}