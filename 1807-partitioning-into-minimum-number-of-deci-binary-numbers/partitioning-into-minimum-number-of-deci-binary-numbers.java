class Solution {
    public int minPartitions(String n) {
        int largest =0;
        for(int i=0;i<n.length();i++){
            largest=Math.max(largest,n.charAt(i)-'0');
        }
        return largest;
    }
}