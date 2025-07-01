public class oddeven {
    public static void main(String[] args) {
        int[]arr={12,332,442,4444,22};
       System.out.println(number(arr));
    }

    static int number(int[]arr){
        int count=0;
        
        for (int i : arr) {
            if(even(i)){
                count++;

            }
            
           
                 
                
            }
            return count;

            
        }
        static boolean even(int i){
            int digitcount=digit(i);
            return digitcount%2==0;
        }

        static int digit(int i){
           int count=0;
            while(i>0){
                count+=1;
                i=i/10;

            }
            return count;
        }

    }
  
