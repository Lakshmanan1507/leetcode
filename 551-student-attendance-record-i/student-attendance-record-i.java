class Solution {
    public boolean checkRecord(String s) {
        int A=0;
        int L=0;
        // int P=0;
        for(char ch :s.toCharArray()){
            if(ch=='A'){
                A++;
                if(A>=2) return false;
            }
            if(ch=='L'){
                L++;
                if(L==3) return false;
            }
            else{
                L=0;
            }
        }
        return A<2 && L<3;
        
    }
}