class Solution {
    public String sortSentence(String s) 
    {

        String[] arr=s.split(" ");
        String[] sorted=new String[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            String str=arr[i];
            int len=str.length();
            int index=str.charAt(len-1)-'1';
            sorted[index]=str.substring(0,len-1);
        } 
        return String.join(" ",sorted);  
    }
}