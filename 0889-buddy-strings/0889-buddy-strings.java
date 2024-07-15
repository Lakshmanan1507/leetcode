public class Solution {
    public boolean buddyStrings(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int diffCount = 0;
        int diffIndex1 = -1;
        int diffIndex2 = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                diffCount++;
                if (diffCount == 1) {
                    diffIndex1 = i;
                } else if (diffCount == 2) {
                    diffIndex2 = i;
                } else {
                    return false;
                }
            }
        }

        if (diffCount == 2) {
            char temp = s.charAt(diffIndex1);
            s = s.substring(0, diffIndex1) + s.charAt(diffIndex2) + s.substring(diffIndex1 + 1);
            s = s.substring(0, diffIndex2) + temp + s.substring(diffIndex2 + 1);
            return s.equals(t);
        } else if (diffCount == 0) {
            boolean hasDuplicate = false;
            boolean[] seen = new boolean[26];
            for (char c : s.toCharArray()) {
                if (seen[c - 'a']) {
                    hasDuplicate = true;
                    break;
                }
                seen[c - 'a'] = true;
            }
            return hasDuplicate;
        } else {
            return false;
        }
    }
}