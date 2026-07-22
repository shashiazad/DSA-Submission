class Solution {
public:
    void merge(vector<int>& arr, int l, int mid, int h){
        int left = l;
        int right = mid+1;
        vector<int> temp;
        while(left <= mid && right <= h){
            if(arr[left] <= arr[right]){
                temp.push_back(arr[left]);
                left++;
            }else{
                temp.push_back(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.push_back(arr[left]);
            left++;
        }
        while(right <= h){
            temp.push_back(arr[right]);
            right++;
        }

        for(int i = l; i <= h; i++){
            arr[i] = temp[i - l];
        }
    }

    void mergeSort(vector<int>& arr, int l, int h){
        if( l >= h){
            return;
        }
        int mid = (l + h)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, h);
        merge(arr, l, mid, h);
    }

    vector<int> sortArray(vector<int>& nums) {
        mergeSort(nums, 0, nums.size()-1);
        return nums;
    }
};