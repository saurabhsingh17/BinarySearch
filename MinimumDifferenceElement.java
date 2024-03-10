public class MinimumDifferenceElement {
    // 4 6 7 9  key - 5
    //if key is present then 0 will be the ans as it would be minimum
    //else neighbour of key will be ans
    //floor and ceil of the no can also be the ans
    public static void main(String[] args) {
        int[] nums = {4,6,7,9};
        int key = 5;
        System.out.println(binarySearch(nums,key));
    }

    static int binarySearch(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == key) {
                return 0;
            } else if (nums[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int ans1 = Math.abs(nums[start] - key);
        int ans2 = Math.abs(nums[end] - key);
        return Math.min(ans1, ans2);
    }
}
