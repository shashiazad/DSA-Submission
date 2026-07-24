class Solution {
    public boolean linearSearch(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        int n = nums.length;
        for(int i =0; i < n; i++){
            int x = nums[i];
            int cnt = 1;
            while(linearSearch(nums, x+1) == true){
                cnt++;
                x += 1;
            }
            longest = Math.max(cnt, longest);
        }
        return longest;
    }
}
