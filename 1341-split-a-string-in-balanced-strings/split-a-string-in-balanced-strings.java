class Solution {
    public int balancedStringSplit(String s) {
        int char_count=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch =='L') 
               char_count++;
            else
               char_count--;
            if(char_count==0){
                count++;
            }
        }
        return count;
    }
}