class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();

        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }
        for(int x: set1)
        {
            if(set2.contains(x))
            {
                res.add(x);
            }
        }

        int [] result=new int[res.size()];
        int i=0;
        for(int x: res)
        {
            result[i]=x;
            i++;
        }
        return result;
    }
}