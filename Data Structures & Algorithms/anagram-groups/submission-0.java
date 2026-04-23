class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();
        for(String str : strs){
            int[] frequency = new int[26];
            for(char c : str.toCharArray()){
                frequency[c-'a']++;
            }
            String key = Arrays.toString(frequency);
            result.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
