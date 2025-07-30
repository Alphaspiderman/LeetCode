from typing import List


class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        soln = 0
        cur_len = 0
        max_val = max(nums)
        for num in nums:
            if max_val == num:
                cur_len += 1
            else:
                soln = max(cur_len, soln)
                cur_len = 0
        return max(cur_len, soln)
