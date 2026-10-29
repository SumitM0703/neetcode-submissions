class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        map1 = {}
        for i in range(len(nums)):
            map1[nums[i]] = map1.get(nums[i],0)+1
        for value in map1.values():
            if value>1:
                return True
        return False

