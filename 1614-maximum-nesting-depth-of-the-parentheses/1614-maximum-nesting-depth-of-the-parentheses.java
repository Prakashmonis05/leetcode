class Solution {
    public int maxDepth(String s) {
        
       
        int count=0;
        int depth=0;

        for(char s1:s.toCharArray())
        {
            if(s1=='(')
            {
                depth++;
                count=Math.max(count,depth);

            }
            else if(s1==')')
            {
                depth--;
            }
        }
        return count;
    }
}