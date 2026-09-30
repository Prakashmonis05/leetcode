class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0;
        int squareSum=1;

        while(n>0)
        {
            int rem=n%10;
            digitSum+=rem;
            squareSum+=rem*rem;
            n=n/10;
        }
        System.out.println(digitSum);
        System.out.println(squareSum);

        if(squareSum-digitSum>=50)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}