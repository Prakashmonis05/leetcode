class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest=Integer.MIN_VALUE;
        

        for(int i=0;i<accounts.length;i++)
        {
            int cur_richest=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                cur_richest+=accounts[i][j];
            }
            if(cur_richest>richest)
            {
                richest=cur_richest;
            }
        }
        return richest;
        
    }
}