class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size() != t.size()) return false;
        unordered_map<char, int> strS;
        unordered_map<char, int> strT;
        for(char ch : s){
            strS[ch]++;
        }
        for(char ch : t){
            strT[ch]++;
        }
        if(strS.size() != strT.size()){
            return false;
        }
        for(auto &key : strS){
            auto val = strT.find(key.first);
            if(val == strT.end() || key.second != val->second){
                return false;
            }
        }
        return true;
    }
};
