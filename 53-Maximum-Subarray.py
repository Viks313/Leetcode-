class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxsub = nums[0]
        cursum = 0
        for num in nums:
            cursum = max(num, cursum + num)
            maxsub = max(maxsub, cursum)
        return maxsub