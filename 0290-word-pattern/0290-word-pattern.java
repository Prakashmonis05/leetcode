class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] arr=s.split(" ");
        int i=0;
        if(arr.length!=pattern.length())
        {
            return false;
        }
        while(arr.length>i && pattern.length()>i)
        {
            if(!map.containsKey(pattern.charAt(i)))
            {
                if(map.containsValue(arr[i]))
                {
                    return false;
                }
                map.put(pattern.charAt(i),arr[i]);
            }
            else
            {
                if(!arr[i].equals(map.get(pattern.charAt(i))))
                {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}