class Solution {
    public String reversePrefix(String s, int k) {
        if(k==0){
            return s;
        }
        StringBuilder res=new StringBuilder();

        for(int i=k-1;i>=0;i--)
        {
            res.append(s.charAt(i));
        }

        for(int i=k;i<s.length();i++)
        {
            res.append(s.charAt(i));
        }

        return res.toString();
    }
}