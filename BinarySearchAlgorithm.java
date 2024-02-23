public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int element = 2;
        System.out.println(binarySearch(nums, element));
    }

    static int binarySearch(int[] arr, int element) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (element == arr[mid]) {
                return mid;
            } else if (element > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
