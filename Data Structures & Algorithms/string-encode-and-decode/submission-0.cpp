class Solution {
public:

    string encode(vector<string>& strs) {
        string res;
        for(string str : strs){
            res += to_string(str.length()) + "#" + str;
        }
        return res;
    }

    vector<string> decode(string s) {
        vector<string> dStr;
        int i = 0;
        while(i < s.length()){
            int j = i;
            while(s[j] != '#'){
                j++;
            }

            int len = stoi(s.substr(i, j - i));

            string str = s.substr(j+1, len);
            dStr.push_back(str);

            i = j + 1 + len;
        }
        return dStr;
    }
};
