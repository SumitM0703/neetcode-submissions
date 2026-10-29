class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        n1 = len(s)
        n2 = len(t)
        map1 = {}
        map2 = {}
        for i in range(n1):
            map1[s[i]]  = map1.get(s[i],0)+1
            map2[t[i]] = map2.get(t[i],0)+1
        return map1 == map2
        