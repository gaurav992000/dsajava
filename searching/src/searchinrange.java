public class searchinrange {
    public static void main(String[] args) {
        int []arr={12,13,45,24,1,53};
        int[][]arr1={
            {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12,11}
        };
int target=12;
int [] ans=search(arr1,target);
        System.out.println(ans);

        // System.out.println(number(arr));
        // System.out.println(min(arr));
    }
    // static boolean number(int[]arr){
    //     for(int i=1;i<4;i++){
    //         if(arr[i]==23){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // static int min(int[]arr){
    //     int ans=arr[0];
    //     for(int i=1;i<arr.length;i++){
    //        if(arr[i]<ans){
    //            ans=arr[i];

    //        }
    //     }return ans;
    // }

    static int[] search (int[][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
     }

}
