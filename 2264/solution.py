class Solution:
    def largestGoodInteger(self, num: str) -> str:
        highest = -1
        for idx, ch in enumerate(num[:-2]):
            if ch == num[idx + 1] == num[idx + 2]:
                highest = max(highest, int(ch))
        if highest == -1:
            return ""
        return str(highest) * 3
