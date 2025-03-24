class Solution {
    public int findComplement(int num) {
        String bin=Integer.toBinaryString(num);
        String str="";
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='0'){
                str+="1";
            }
            else{
                str+="0";
            }
        }
        int k=Integer.parseInt(str,2);
        return k;
    }
}