class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet hex =new HashSet();

        for(int num:nums){
            if(hex.contains(num)){
                return true;
            }
            hex.add(num);
        }
        return false;
    }
}