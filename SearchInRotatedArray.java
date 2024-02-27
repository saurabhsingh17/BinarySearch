public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            else
                end = mid;
        }
        int index = start;
        int ans = binarySearch(nums, 0, index-1, target);
        int ans2 = binarySearch(nums, index, nums.length-1, target);
        if( ans != -1 ) {
            return ans;
        }
        if( ans2 != -1 ) {
            return ans2;
        }
        if (ans2 == -1 && ans == -1){
            return -1;
        }
        return -1;
    }
    static int binarySearch(int[] nums,int startt, int index, int target) {
        int start = startt;
        int end = index;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
