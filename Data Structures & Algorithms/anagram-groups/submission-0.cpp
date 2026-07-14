class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> res;
        unordered_map<string, vector<string>> mp;
        for(auto str : strs){
            string keystr = str;
            sort(keystr.begin(), keystr.end());
            mp[keystr].push_back(str);
        }
        for(auto[key, group] : mp){
            res.push_back(move(group));
        }
        return res;
    }
};
