import java.util.ArrayList;

public class findnumber {
    public static void main(String[] args) {

        int[]arr={1,2,4,5,6};
        System.out.println(find(arr,0,10));
        System.out.println(findone(arr,0,11));
    }


    static boolean find(int[]arr,int index,int target){
        if(index>arr.length-1){
            return false;
        }
        return arr[index]==target|| find(arr,index+1,target);
    }


    static int findone(int[]arr,int index,int target){
        if(index>arr.length-1){
            return -1;
        }
        if(arr[index]==index) {
            return index;
        }else {
           return findone(arr,index+1,target);
        }

    }



    static ArrayList<Integer> findAllIndex2(int[]arr,int target,int index){
ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
ArrayList<Integer>ansFromBelowCalls=findAllIndex2(arr,target,index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}





