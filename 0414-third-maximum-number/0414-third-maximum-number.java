import java.util.*;

class Solution {
public int thirdMax(int[] nums) 
{
    Arrays.sort(nums);

    TreeSet<Integer> set = new TreeSet<>();

    for (int num : nums) {
        set.add(num);
    }

    if (set.size() < 3) {
        return set.last();
    }

    Iterator<Integer> it = set.descendingIterator();

    it.next(); // First maximum
    it.next(); // Second maximum

    return it.next(); // Third maximum
}
}