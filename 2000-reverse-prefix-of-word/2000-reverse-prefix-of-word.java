class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str=new StringBuilder();
        int i = 0;
        while (i < word.length()-1 && word.charAt(i) != ch) {
            i++;

        }

        if (word.charAt(i) == ch) {
            for (int j = 0; j <= i; j++) {
                str.insert(0,word.charAt(j));
            }

            for (int j = i + 1; j < word.length(); j++) {
                str.append(word.charAt(j));
            }

        }
        else
        {
            return word;
        }

        return str.toString();
    }
}