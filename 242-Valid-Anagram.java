class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        char[] srray=s.toCharArray();
        char[] trray=t.toCharArray(); 
        Arrays.sort(srray);
        Arrays.sort(trray);

        return Arrays.equals(srray,trray);
    }
}