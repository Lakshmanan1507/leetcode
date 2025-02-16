class Solution {
    public int smallestNumber(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder str = new StringBuilder(bin).replace(0, bin.length(), bin.replace('0','1'));
        int X = Integer.parseInt(str.toString(), 2);
        return X;
    }
}