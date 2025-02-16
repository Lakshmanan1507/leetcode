class Solution {
    public boolean canAliceWin(int n) {
        int count=0;
        int win=10;
        while(n>=win){
            n-=win;
            win--;
            count++;
        }
        return count%2!=0;
    }
}