import java.util.Arrays;

public class selectionsort {

    public static void main(String[] args) {
        int[]arr={5,3,2,4,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxindex=maxnumber(arr,0,last);
            swap(arr,maxindex,last);
        }

    }

    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }


    static int maxnumber(int[]arr,int first, int end){
        int max=first;
        for(int i=0;i<=end;i++){

            if(arr[i]>arr[max]){

                max=i;

            }
        }
        return max;

    }


}
