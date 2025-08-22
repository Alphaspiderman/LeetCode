class Solution:
    def minimumArea(self, grid: List[List[int]]) -> int:
        min_i = 9999
        min_j = 9999
        max_i = 0
        max_j = 0
        for i, row in enumerate(grid):
            for j, elem in enumerate(row):
                if elem == 1:
                    min_i = min(min_i, i)
                    min_j = min(min_j, j)
                    max_i = max(max_i, i)
                    max_j = max(max_j, j)
        return (max_i - min_i + 1) * (max_j - min_j + 1)