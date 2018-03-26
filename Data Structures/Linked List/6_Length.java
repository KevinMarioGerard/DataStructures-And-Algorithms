class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static int recursive(Node head){
    if(head == null){
      return 0;
    }
    return recursive(head.next) + 1;
  }
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    Node first = new Node(0);
    Node second = new Node(2);
    Node third = new Node(1);
    Node head = first;
    first.next = second;
    second.next = third;
    Node n = head;
    int ilength = 0;
    while(n != null){
      n = n.next;
      ilength++;
    }
    System.out.println(ilength);
    int rlength = recursive(head);
    System.out.println(rlength);
  }
}
