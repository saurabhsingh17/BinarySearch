public class FindPositionOfAnElementInInfiniteSortedArray {
    public static void find(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while(target > nums[end]){
            start = end;
            end = end * 2;
        }
        //binary_search(start,end,target);
       // return pos;
    }
}
