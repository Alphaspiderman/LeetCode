from collections import Counter
class Solution:
    def reorderedPowerOf2(self, n: int) -> bool:
        num_c = Counter(str(n))
        val = 1
        i = 0
        while val < pow(10, 9):
            val = pow(2, i)
            val_c = Counter(str(val))
            if num_c == val_c:
                return True
            else:
                i += 1
        return False