public class SearchInMountainArray {

//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peakElement = findPeak(mountainArr);
//
//        int resLeft = binarySearchInIncreasingArray(mountainArr, peakElement, target);
//        int resRight = binarySearchInDecreasingArray(mountainArr, peakElement, target);
//
//        if(resLeft != -1) {
//            return resLeft;
//        }
//        if(resRight != -1)
//            return resRight;
//        return -1;
//    }
//    static int findPeak(MountainArray mArray){
//        int start = 1 ;
//        int end  = mArray.length()-2;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            int midElement = mArray.get(mid);
//            int leftNbr = mArray.get(mid - 1);
//            int rightNbr = mArray.get(mid + 1);
//            if (midElement > leftNbr && midElement > rightNbr) return mid;
//            else if (midElement < leftNbr) end = mid - 1;
//            else if (midElement < rightNbr) start = mid + 1;
//        }
//        return -1;
//
//    }
//    static int binarySearchInIncreasingArray(MountainArray mArray, int end, int target) {
//        int start = 0;
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//            int element = mArray.get(mid);
//            if( element == target) {
//                return mid;
//            }
//            else if (target > element) {
//                start = mid + 1;
//            }
//            else if(target < element){
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//    static int binarySearchInDecreasingArray(MountainArray mArray, int start, int target) {
//        int end = mArray.length()-1;
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//            int element = mArray.get(mid);
//            if( element == target) {
//                return mid;
//            }
//            else if (target > element) {
//                end = mid - 1;
//            }
//            else if(target < element){
//                start = mid + 1;
//
//            }
//        }
//        return -1;
//    }
}
