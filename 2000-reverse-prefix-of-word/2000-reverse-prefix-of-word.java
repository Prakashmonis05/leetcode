class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        while (i < word.length()-1 && word.charAt(i) != ch) {
            i++;

        }
        String str = "";

        if (word.charAt(i) == ch) {
            for (int j = 0; j <= i; j++) {
                str = word.charAt(j) + str;
            }

            for (int j = i + 1; j < word.length(); j++) {
                str = str + word.charAt(j);
            }

        }
        else
        {
            return word;
        }

        return str;
    }
}