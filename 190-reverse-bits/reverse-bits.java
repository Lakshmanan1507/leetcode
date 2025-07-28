class Solution {
    public int reverseBits(int n) {
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(n));
        while (binary.length() < 32) {
            binary.insert(0, "0");
        }
        binary.reverse();
        return (int) Long.parseLong(binary.toString(), 2); // Use Long.parseLong to avoid overflow
    }
}