class Solution:
    def zeroFilledSubarray(self, nums: List[int]) -> int:
        soln = 0
        tmp = 0
        for elem in nums:
            if elem == 0:
                tmp += 1
                soln += tmp
            else:
                tmp = 0
        return soln