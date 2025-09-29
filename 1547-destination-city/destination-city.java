class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet <String> city=new HashSet <String>();
        for(List <String> path :paths){
            city.add(path.get(0));
        }
        for(List <String> path : paths){
            if(!city.contains(path.get(1))){
                return path.get(1);
            }
        }
        return "";
    }
}