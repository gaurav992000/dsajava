public class ntimesname {
    public static void main(String[]args){
        int n=4;
        oneton(0,n);



    }
//    static void f(int i,int n){
//        if(i>n){
//            return;
//        }
//        System.out.println("n");
//        f(i+1,n);
//
//    }


    static void oneton(int i,int n){
        if(i>n){
            return;
        }

        oneton(i+1,n);
        System.out.println(i);

    }

}
