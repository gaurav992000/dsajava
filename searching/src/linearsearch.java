public class linearsearch {
    public static void main(String[] args) {
        int[] nums={23,45,1,2,8,19,-3,16,-11,28};
        int targer=19;


    }
    static  boolean search(int[] nums,int target){
        if(nums.length==0){
            return false;

        }
        for (int i:nums
             ) { if(nums[i]==target){
                 return true;
        }
            
        }
return false;
    }
    
}
