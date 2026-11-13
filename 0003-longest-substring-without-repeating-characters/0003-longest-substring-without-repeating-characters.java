class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, i);

            int cur = i - left + 1;

            max = Math.max(max, cur);
        }

        return max;
    }
}