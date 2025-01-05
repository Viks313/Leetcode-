class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] freq=new int[26];

        for(int n=0;n<s.length();n++){
            freq[s.charAt(n)-'a']++;
            freq[t.charAt(n)-'a']--;
        }

        for(int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}