  public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail =head;
        }

        size+=1;

    }

    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value +"->");
            temp=temp.next;

        }

    }

    public int deletelast(){
        if(size<=1){
            return deletelast();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;

        
    }
    // get function is for when we have to find node when index is given
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;

        }
        return node;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){

            this.value=value;
        }

        public Node (int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
