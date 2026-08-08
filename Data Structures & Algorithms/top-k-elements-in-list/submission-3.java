class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            if(bucket[count] == null){
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(num);
        }

        int[] res = new int[k];
        int idx = 0;

        for(int i = bucket.length - 1; i >= 0 && idx < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    res[idx++] = num;
                    if(idx == k){
                        break;
                    }
                }
            }
        }
        return res;
    }
}
