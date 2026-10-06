class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        ArrayList<Integer> list=new ArrayList<>();

        
        
            int rem=1;
            for(int i=n-1;i>=0;i--)
            {
                if(digits[i]+rem>=10)
                {
                    
                    list.add(0);
                    rem=1;
                }
                else
                {
                    list.add(digits[i]+rem);
                    rem=0;
                }
            }
            if(rem==1)
            {
                list.add(1);
            }
        

        Collections.reverse(list);

        int[] array2=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            array2[i]=list.get(i);
        }
        return array2;
        
    }
}