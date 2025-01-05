class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> maps= new HashMap<>();


        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String Sortedstr= new String (charArray);

            if(!maps.containsKey(Sortedstr)){
                maps.put(Sortedstr, new ArrayList<>());
            }
            maps.get(Sortedstr).add(str);

        }
         return new ArrayList<>(maps.values());
    }
}