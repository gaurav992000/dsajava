package Dll;

public class doublelinkedlist {
  private Node head;


  public void insertfirst(int val){

      Node node=new Node(val);
      node.next=head;
      node.prev=null;
      if(head!=null){
          head.prev=node;
      }

      head=node;
  }




  public void display(){
      Node node=head;
      Node last=null;
    while(node!=null){
        System.out.print(node.val+"->");
        last=node;

        node=node.next;
    }
      System.out.print("end");
      System.out.println("");

    while (last!=null){
        System.out.print(last.val+"->");
        last=last.prev;

    }

    }
    public void insertLast(int val){
      Node node=new Node( val);
      Node last=head;

      if(head==null){
          node.prev=null;
          head=node;
          return;

      }

      while(last.next!=null){
          last=last.next;
      }
      last.next=node;
      node.prev=last;




    }


    public Node find(int val){
      Node node=head;
      while (node!=null){
          if(node.val==val){
              return node;

          }
          node=node.next;
      }

      return null;
    }



private class Node{
    int val;
    Node next;
    Node prev;
    public Node(int val){
        this.val=val;
    }

    public Node(int val,Node next,Node prev){
        this.val=val;
        this.next=next;
        this.prev=prev;
    }

}
}





