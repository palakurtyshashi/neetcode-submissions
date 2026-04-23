class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> myMap = new HashMap<>();

        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();

        for (char c : schars){
            myMap.put(c,myMap.getOrDefault(c,0)+1);
        }

        for (char c : tchars){
            myMap.put(c,myMap.getOrDefault(c,0)-1);
        }

        for (var pair: myMap.entrySet()){
            if(pair.getValue()!=0)
                return false;
        }
        return true;
    }
}
