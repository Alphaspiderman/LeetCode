class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        map = {}
        start = 0
        soln = 0
        for idx, tree in enumerate(fruits):
            map[tree] = map.get(tree, 0) + 1
            while len(map) > 2:
                map[fruits[start]] -= 1
                if map[fruits[start]] == 0:
                    del map[fruits[start]]
                start += 1
            soln = max(soln, idx - start + 1)
        return soln