class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static Node deleteKey(int key, Node head){
    Node nex = head;
    Node prev = nex;
    while(nex.data != key){
      prev = nex;
      nex = nex.next;
    }
    prev.next = nex.next;
    return head;
  }
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node head = first;
    first.next = second;
    second.next = third;
    head = deleteKey(2, head);
    Node n = head;
    while(n != null){
      System.out.println(n.data);
      n = n.next;
    }
  }
}
