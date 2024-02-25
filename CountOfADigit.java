public class CountOfADigit {
    int count(int[] arr, int n, int x) {
        int firstOcc = binarySearch(arr, x);
        int lastOcc = binarySearch2(arr, x);
        if(firstOcc == -1 && lastOcc == -1) {
            return 0;
        }
        return lastOcc - firstOcc +1;
    }
    static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int first = -1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;

            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return first;
    }
    static int binarySearch2(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int last = -1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;

            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return last;

    }
}
