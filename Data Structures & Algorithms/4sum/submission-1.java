class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n - 3; i++){
            for(int j= i + 1; j < n - 2; j++){
                int l = j+1;
                int r = n - 1;
                while(l < r){
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target){
                        st.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                    }else if(sum > target){
                        r--;
                    }else{
                        l++;
                    }
                }
            }
        }
        return new ArrayList<>(st);
    }
}