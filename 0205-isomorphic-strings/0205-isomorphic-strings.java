class Solution {
    public boolean isIsomorphic(String s, String t) {
        int s1= s.length();
        int t1 = t.length();
        if(s1 != t1){
            return false;
        }
        HashMap<Character, Character> stMap = new HashMap();
        HashMap<Character, Character> tsMap = new HashMap();

        for(int i=0;i<s1;i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(stMap.containsKey(a)){
                if(stMap.get(a) != b){
                    return false;
                }
            } else {
                stMap.put(a,b);
            }

            if(tsMap.containsKey(b)){
                if(tsMap.get(b) != a){
                    return false;
                }
            } else {
                tsMap.put(b,a);
            }
        }
        return true;
    }
}