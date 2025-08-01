class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        soln = [[1], [1, 1]]
        if numRows < 3:
            return soln[:numRows]
        prev = soln[-1]
        for row in range(2, numRows):
            new_row = [1]
            for idx in range(1, row):
                new_row.append(prev[idx - 1] + prev[idx])
            new_row.append(1)
            soln.append(new_row)
            prev = new_row
        return soln
