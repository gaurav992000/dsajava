import java.util.Arrays;

public class sortedmatrix {
    public static void main(String[] args) {
        int[][] arr ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target=-1;
        System.out.println(Arrays.toString(searchrow(arr,target)));
        





    }

    static  int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }

                if(target<arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
        }
        return -1;

    }

    static int[] searchrow(int[][] arr,int target){
        for(int i=0;i<3;i++){
            if(arr[i][0]<=target && arr[i][2]>=target){
                return new int []{i,
                    binarysearch(arr[i], target)
                };


            }
        }
        return new int[]{-1,-1};



    }

}

