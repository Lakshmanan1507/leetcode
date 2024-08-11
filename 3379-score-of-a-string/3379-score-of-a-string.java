class Solution {
    public int scoreOfString(String s) {
        char c[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<c.length-1;i++){
            sum+=Math.abs(c[i]-c[i+1]);
        }
        return sum;
        
    }
}