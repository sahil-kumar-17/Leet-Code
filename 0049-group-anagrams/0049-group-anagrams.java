class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> myMap = new HashMap<>();
        for (String word : strs) {
            char ch[] = word.toCharArray();
            Arrays.sort(ch);
            String key= new String(ch);
            if(!myMap.containsKey(key)){
                myMap.put(key,new ArrayList<>());
            }
            myMap.get(key).add(word);
        }
        return new ArrayList<>(myMap.values());
    }
}