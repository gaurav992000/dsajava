// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(31);
        list.insertFirst(13);

        list.Display();

        System.out.println(list.deletelast());
        list.Display();


    }

}