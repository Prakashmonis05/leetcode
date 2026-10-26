class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int j=m-1;
        int i=0;
        int count=0;

        while(i<n && j>=0)
        {
            if(grid[i][j]>=0)
            {
                i++;
            }
            else if(grid[i][j]<0)
            {
                j--;
                count+=n-i;
            }
        }
        return count;
    }
}