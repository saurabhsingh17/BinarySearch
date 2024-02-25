public class FirstAndLastPositionOfAnElement {
    public int[] searchRange(int[] nums, int target) {
        int firstOcc = binarySearch(nums, target);
        int lastOcc = binarySearch2(nums, target);
        return new int[]{firstOcc, lastOcc};
    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;

            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    static int binarySearch2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;

            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;

    }
}
