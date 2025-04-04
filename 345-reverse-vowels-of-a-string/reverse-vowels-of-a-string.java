class Solution {
    public String reverseVowels(String s) {
        StringBuilder vowel = new StringBuilder();

        // Collect all vowels
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            if (isVowel(ch1)) {
                vowel.append(ch1);
            }
        }

        StringBuilder result = new StringBuilder();
        int n = vowel.length() - 1;

        // Build result by replacing vowels with reversed ones
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                result.append(vowel.charAt(n--));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    private boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}
