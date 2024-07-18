public class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0, bobTotal = 0;
        for (int size : aliceSizes) aliceTotal += size;
        for (int size : bobSizes) bobTotal += size;

        int delta = (bobTotal - aliceTotal) / 2;
        Set<Integer> bobSet = new HashSet<>();
        for (int size : bobSizes) bobSet.add(size);

        for (int aliceSize : aliceSizes) {
            if (bobSet.contains(aliceSize + delta)) {
                return new int[]{aliceSize, aliceSize + delta};
            }
        }

        return new int[0];
    }
}