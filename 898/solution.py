class Solution:
    def subarrayBitwiseORs(self, arr: List[int]) -> int:
        unique = set()
        temp = set()
        for elem in arr:
            temp = {u | elem for u in temp}
            temp.add(elem)
            unique.update(temp)
        return len(unique)