class Solution:
    def numOfUnplacedFruits(self, fruits: List[int], baskets: List[int]) -> int:
        res = 0
        basket_count = len(baskets)
        for fruit in fruits:
            is_not_set = 1
            for i in range(basket_count):
                if fruit <= baskets[i]:
                    is_not_set = 0
                    baskets[i] = 0
                    break
            res += is_not_set
        return res