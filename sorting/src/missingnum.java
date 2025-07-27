public class missingnum {
    public static void main(String[] args) {

    }
   static int mising(int[]arr ){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }

        }

        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;

            }
        }

return arr.length;
   }


    static void swap(int[]arr, int i ,int correct){

        int tamp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=tamp;


    }



}
