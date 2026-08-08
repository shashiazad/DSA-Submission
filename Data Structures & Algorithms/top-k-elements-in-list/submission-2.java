class Solution {
    class Pair{
        int n;
        int fq;
        Pair(int n, int fq){
            this.n = n;
            this.fq = fq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.fq - b.fq);

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            pq.offer(new Pair(entry.getKey(), entry.getValue()));

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] res = new int[k];

        for(int i = 0; i < k; i++){
            res[i] = pq.poll().n;
        }
        return res;
    }
}
