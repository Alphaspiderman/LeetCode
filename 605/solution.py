class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        soln = 0
        ln = len(flowerbed)
        for idx, val in enumerate(flowerbed):
            if val == 0:
                if (idx == 0 or flowerbed[idx - 1] == 0) and (
                    idx == ln - 1 or flowerbed[idx + 1] == 0
                ):
                    flowerbed[idx] = 1
                    soln += 1
        return soln >= n
