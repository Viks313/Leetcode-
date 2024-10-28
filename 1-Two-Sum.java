class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int currentnumber=nums[i];
            int complement=target-currentnumber;
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(currentnumber,i); 
        }
        return new int[]{};
    }
}