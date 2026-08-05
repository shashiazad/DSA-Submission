class Solution {
    int[] merge(int l, int mid, int r, int[] arr){
        int left = l;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= r){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= r){
            temp.add(arr[right]);
            right++;
        }

        for(int i = 0; i < temp.size(); i++){
            arr[l+i] = temp.get(i);
        }
        return arr;
    }
    int[] mergeSort(int l, int r, int[] arr){
        if(l >= r) return arr;
        int mid = (l+r)/2;
        mergeSort(l, mid, arr);
        mergeSort(mid+1, r, arr);
        merge(l, mid, r, arr);
        return arr;
    }
    public int[] sortArray(int[] nums) {
        return mergeSort(0, nums.length - 1, nums);
    }
}