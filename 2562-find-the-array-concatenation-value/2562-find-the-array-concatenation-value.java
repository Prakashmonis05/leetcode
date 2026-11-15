class Solution {
    public long con(int[] nums, int start,int end)
    {       
            String s=""+nums[start]+""+nums[end];

            long res=(long)Integer.parseInt(s);
            return res;

    }

    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=nums.length-1;
        long res=0;

        while(start<end)
        {

            res+=con(nums,start,end);
            start++;
            end--;
        }

        if(n%2!=0)
        {
            int mid=n/2;

            res+=nums[mid];
        }

        return res;
        
    }
}