class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int max_candy=candies[0];
        for(int i=1;i<candies.length;i++)
        {
            max_candy=Math.max(candies[i],max_candy);
        }

        for(int i=0;i<candies.length;i++)
        {   
    
            if(candies[i]+extraCandies>=max_candy)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }

        return list;
        
    }
}