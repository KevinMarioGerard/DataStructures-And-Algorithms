class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
public static void pairwiseSwap(Node head){
  while(head != null && head.next != null){
    head.data = head.next.data ^ (head.next.data = head.data) ^ head.next.data;
    head = head.next.next;
  }
}
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    Node first = new Node(0);
    Node second = new Node(1);
    Node third = new Node(2);
    Node fourth = new Node(3);
    Node fifth = new Node(4);
    Node sixth = new Node(5);
    Node seventh = new Node(6);
    Node head = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    //sixth.next = seventh;
    pairwiseSwap(head);
    Node n = head;
    while(n != null){
      System.out.print(n.data + " ");
      n = n.next;
    }
  }
}
