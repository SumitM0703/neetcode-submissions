class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        //Getting the count of the  element
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //Min heap based on the frequencies
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        //Adding element in the minheap 
        //Minheap me add kart hi element khud hi khud ko arrange kar lega 
        for(int key : map.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }

        }
        //FINAL RESULT 
        int[] result = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            result[i] = pq.poll();
            i++;
        }
        return result;
    }

        

        
    }
