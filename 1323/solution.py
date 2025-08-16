class Solution:
    def maximum69Number(self, num: int) -> int:
        num_s = str(num)
        return int(num_s.replace("6", "9", 1))
