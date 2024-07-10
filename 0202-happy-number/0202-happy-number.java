public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        return isHappyHelper(n, seen);
    }

    private boolean isHappyHelper(int n, Set<Integer> seen) {
        if (n == 1) {
            return true;
        }
        if (seen.contains(n)) {
            return false;
        }
        seen.add(n);
        int sum = getSumOfSquares(n);
        return isHappyHelper(sum, seen);
    }

    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n!= 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(19));  // true
        System.out.println(solution.isHappy(20));  // false
    }
}