class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        //Hasmap of the number and its index:
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            int num = nums[i];
            int required = target-num;
            if(map.containsKey(required)){
                return new int[]{map.get(required), i};
            }
            map.put(num,i);


        }
       return new int[]{};

        
    }
}
