class Solution {
    public boolean isPalindrome(int x) {
     String str=String.valueOf(x);
     int s=0;
     int size=str.length()-1;
     while(s<size){
     if(str.charAt(s)!=str.charAt(size)){
        return false;
     }
        s++;
        size--;
     }
     return true;
     }
    }