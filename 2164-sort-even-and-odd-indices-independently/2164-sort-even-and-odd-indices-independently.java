class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int[] odd=new int[n/2];
        int[] even;

        if(n%2==0)
        {
            even=new int[n/2];
        }
        else
        {
            even=new int[n/2+1];
        }
        

        int ind=0;
        for(int i=0;i<n;i+=2)
        {
            even[ind]=nums[i];
            ind++;
        }
        ind=0;
        for(int i=1;i<n;i+=2)
        {
            odd[ind]=nums[i];
            ind++;
        }

        Arrays.sort(odd);
        Arrays.sort(even);

        int[] res=new int[n];

        ind=0;
        for(int i=0;i<n;i+=2)
        {
            res[i]=even[ind];
            ind++;
        }

        ind=odd.length-1;
        for(int i=1;i<n;i+=2)
        {
            res[i]=odd[ind];
            ind--;
        }

        return res;


    }
}