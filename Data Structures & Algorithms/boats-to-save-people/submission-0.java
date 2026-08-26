class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0;
        int r = people.length - 1;
        int cnt = 0;
        Arrays.sort(people);
        while(l <= r){
            if(people[l] + people[r] <= limit){
                l++;
            }
            cnt++;
            r--;
        }
        return cnt;
    }
}