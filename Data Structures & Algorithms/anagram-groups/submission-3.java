class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            mp.putIfAbsent(s, new ArrayList());
            mp.get(s).add(str);
        }
        ans.addAll(mp.values());
        return ans;
    }
}
