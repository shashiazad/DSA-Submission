class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int, int> hash;
        for(int ele : nums){
            if(hash[ele] > 0){
                return true;
            }
            hash[ele]++;
        }
        return false;
    }
};