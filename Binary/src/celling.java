public class celling {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 9, 14, 16, 18,19};
//        int target = 10;
//        int ans = ceiling(arr, target);
//        System.out.println(ans);
        char letters []={'a','b',
        'c','e','f'};

char target='d';
     char ans=   nextGreatestLetter(letters,target);
        System.out.println(ans);
    }




//    static int ceiling(int[] arr, int target) {
//
//        // but what if the target is greater than the greatest number in the array
//        if (target > arr[arr.length - 1]) {
//            return -1;
//        }
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                // ans found
//                return mid;
//            }
//        }
//        return start;
//    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }



}
