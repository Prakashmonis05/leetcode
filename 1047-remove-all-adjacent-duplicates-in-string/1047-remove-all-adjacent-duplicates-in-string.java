class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<Character>();

        for(char c:s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek()==c)
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        String new_s="";
        while(!stack.isEmpty())
        {
            new_s=stack.pop()+new_s;
        }


        return new_s;
    }
}