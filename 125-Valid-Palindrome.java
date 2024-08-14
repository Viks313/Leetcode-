
class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove all non-alphanumeric characters
        s = s.toLowerCase().replaceAll(\[^a-z0-9]\, \\);

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
