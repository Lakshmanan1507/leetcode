class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map <Integer,Integer> map=new HashMap <>();
        for(int num :nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List <Integer> list=new ArrayList<>();
        for(int num :nums2){
            if(map.containsKey(num)){
                list.add(num);
                map.remove(num);
            }
        }
        int [] result=new int [list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}