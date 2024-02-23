public class SearchInReverseSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        int number = 3;
        System.out.println(search(nums, number));
    }

    public static int search(int[] nums, int number) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (number == nums[mid]) {
                return mid;
            } else if (number < nums[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
