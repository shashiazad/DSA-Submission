class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int e1 = -1;
        int e2 = -1;
        for(int i : nums){
            if(c1 == 0 && i != e2){
                c1 = 1;
                e1 = i;
            }
            else if(c2 == 0 && i != e1){
                c2 = 1;
                e2 = i;
            }
            else if(i == e1){
                c1++;
            }else if(i == e2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        c1 = 0; c2 = 0;
        for(int i : nums){
            if(i == e1) c1++;
            if(i == e2) c2++;
        }
        if(c1 > nums.length/3) ls.add(e1);
        if(c2 > nums.length/3) ls.add(e2);
        return ls;
    }
}