public class Mountainarray {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,3,1};
        int target=3;
        int firstnumber=peaknumber(arr);
       int accending= order(arr,target,0,firstnumber);
       int result;
       if(accending!=-1){
           result= accending;
       }else{
           result= order(arr,target,firstnumber,arr.length-1);
       }
        System.out.println(result);


    }

    static int peaknumber(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else {
                end=mid;
            }
        }
return start;
    }

    static int order(int[]arr,int target,int start,int end){

        boolean accending=arr[start]<arr[end];

        while (start<end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(accending){
                if(target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }






}
