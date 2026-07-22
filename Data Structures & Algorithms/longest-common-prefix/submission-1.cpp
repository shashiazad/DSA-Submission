class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string prefix;
        string s1 = strs[0];
        cout << s1;
        bool yes = true;
        for(int i = 0; i < s1.length(); i++){
            for(string str : strs){
                if(i > str.length() || s1[i] != str[i]){
                    return prefix;
                }
            }
            prefix += s1[i];
        }
        return prefix;
    }
};