class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0;
        Set<List<Integer>> ls = new HashSet<>();
        Arrays.sort(nums);
        while(i < nums.length - 2){
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] == 0){
                    ls.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }else if(nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }else{
                    j++;
                }
            }
            i++;
        }
        return new ArrayList<>(ls);
    }
}
