class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        l1 = len(word1)
        l2 = len(word2)
        soln = []
        for i in range(min(l1, l2)):
            soln.extend([word1[i], word2[i]])
        if l1 > l2:
            soln.extend(word1[l2:])
        else:
            soln.extend(word2[l1:])
        return "".join(soln)
