public class riversenumber {
    public static void main(String[]args){


        System.out.println(reverse(12425));

    }

    static int reverse(int n){
        int sum=0;
        if(n==0){
            return 0;
        }
        int number=n%10;
         sum=sum*10+number;
//        System.out.println(number);

       reverse(n/10);
       return sum;


    }
}
