import java.util.Arrays;

public class Richestperson {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 4}, {4, 6, 2}};
        System.out.println(Arrays.toString(find(arr)));
    }

    static int[] find(int[][]arr){
          int temp=0;
          int []rowcol=new int[2];


        for(int i=0;i<arr.length;i++){

            int ans=0;


            for(int j=0;j<arr[i].length;j++){
                ans += arr[i][j];
                if(ans>temp){
                    temp=ans;
                   rowcol=new int[]{i,j};

                }

            }
        }
        return rowcol;



    }

//    static  int [] find(int[][] arr){
//        int temp=0;
//
//
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for(int j=0;j<arr[i].length;j++){
//                 sum+=arr[i][j];
//
//
//            }
//
//            }
//
//        }

    }
    

