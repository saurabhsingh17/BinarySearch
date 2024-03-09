public class FloorInASortedArray {
    static int findFloor(long arr[], int n, long x) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                res = mid;
                start = mid + 1;
            }
            if (arr[mid] > x) {
                end = mid - 1;
            }
        }
        return res;

    }
}
