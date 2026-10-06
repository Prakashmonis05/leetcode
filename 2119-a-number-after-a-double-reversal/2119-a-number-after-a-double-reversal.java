class Solution {
    public int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int rev=reverse(num);
        int new_rev=reverse(rev);

        if(num==new_rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}