class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static Node deletePosition(int position, Node head){
    Node nex = head;
    Node prev = nex;
    int i = 1;
    while(i != position){
      prev = nex;
      nex = nex.next;
      i++;
    }
    prev.next = nex.next;
    return head;
  }
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    Node first = new Node(0);
    Node second = new Node(2);
    Node third = new Node(1);
    Node head = first;
    first.next = second;
    second.next = third;
    head = deletePosition(2, head);
    Node n = head;
    while(n != null){
      System.out.println(n.data);
      n = n.next;
    }
  }
}
