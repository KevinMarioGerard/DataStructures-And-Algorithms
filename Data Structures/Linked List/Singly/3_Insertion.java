class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static Node insertFirst(int d, Node head){
    Node n = new Node(d);
    n.next = head;
    head = n;
    return head;
  }
  public static Node insertBetween(int d, int key, Node head){
    Node n = new Node(d);
    Node temp = head;
    while(temp.data != key){
      temp = temp.next;
    }
    n.next = temp.next;
    temp.next = n;
    return head;
  }
  public static Node insertEnd(int d, Node head){
    Node n = new Node(d);
    Node temp = head;
    while(temp.next != null){
      temp = temp.next;
    }
    n.next = temp.next;
    temp.next = n;
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
    head = insertFirst(0, head);
    head = insertBetween(0, 2, head);
    head = insertEnd(0, head);
    Node n = head;
    while(n != null){
      System.out.println(n.data);
      n = n.next;
    }
  }
}
