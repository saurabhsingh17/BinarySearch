public class MinimumNoOfPages {
    public static int findPages(int[] A, int N, int M) {
        if (M > N) {
            return -1;
        }
        int sum = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];
            max = Math.max(max, A[i]);
        }
        int start = max;
        int end = sum;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(A, N, M, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    static boolean isValid(int[] A, int N, int M, int max) {
        int persons = 1;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
            if (sum > max) {
                persons++;
                sum = A[i];
            }
            if (persons > M) {
                return false;
            }
        }
        return true;
    }
}
