class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }

        List<List<Integer>> list=new ArrayList<>();

        HashSet<Integer> list1=new HashSet<>();
        HashSet<Integer> list2=new HashSet<>();

        for(int i=0;i<nums1.length;i++)
        {
            if(!set2.contains(nums1[i]))
            {
                list1.add(nums1[i]);
            }
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(!set1.contains(nums2[i]))
            {
                list2.add(nums2[i]);
            }
        }

        list.add(new ArrayList<>(list1));
        list.add(new ArrayList<>(list2));

        return list;
    }
}