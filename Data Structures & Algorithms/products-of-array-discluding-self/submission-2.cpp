class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> res;
        int product = 1;
        int zerocount = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] == 0){
                zerocount++;
            } else{
                product *= nums[i];
            }
        }
        for(int i = 0; i < nums.size(); i++){
            if(zerocount > 1){
                res.push_back(0);
            }
            else if(zerocount == 1){
                if(nums[i] == 0){
                    res.push_back(product);
                }else{
                    res.push_back(0);
                }
            }else{
                res.push_back(product / nums[i]);
            }
        }
        return res;
    }
};
