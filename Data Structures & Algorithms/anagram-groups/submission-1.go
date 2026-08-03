func groupAnagrams(strs []string) [][]string {
    mp := make(map[string][]string)

    for _, str := range strs{
        ch := []byte(str)

        sort.Slice(ch, func(i, j int) bool {
            return ch[i] < ch[j]
        })

        key := string(ch)

        mp[key] = append(mp[key],str)
    }

    ans := make([][]string, 0, len(mp))

    for _, group := range mp {
        ans = append(ans, group)
    }
    return ans
}
