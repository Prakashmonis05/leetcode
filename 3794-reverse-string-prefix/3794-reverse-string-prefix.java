class Solution {
    public String reversePrefix(String s, int k) {
        if(k==1)
        {
            return s;
        }
        String res="";
        for(char n:s.substring(0,k).toCharArray())
        {
            res=n+res;
        }
        for(char n:s.substring(k,s.length()).toCharArray())
        {
            res=res+n;
        }
        return res;
    }
}