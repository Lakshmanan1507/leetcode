class Solution {
    public int strStr(String haystack, String needle) {
        int a=needle.length();
        for(int i=0;a<=haystack.length();i++,a++){
            if(haystack.substring(i,a).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}