class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> lax=new HashSet<>();
        for(int i :nums){
            lax.add(i);
        }
        int j=1;
        while(lax.contains(j)){
            j++;
        }
        return j;

    }
}