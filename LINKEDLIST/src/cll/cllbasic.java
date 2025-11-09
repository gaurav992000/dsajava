package cll;

public class cllbasic {
    private Node head;
    private Node tail;

    public void insert(int val){
        Node node=new Node(val);

    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

    }


}
