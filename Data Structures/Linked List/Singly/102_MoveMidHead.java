class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static Node moveMidNodePointer(Node head){
    Node slow = head;
    Node fast = head;
    Node prev = null;
    while(fast != null && fast.next != null){
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    prev.next = slow.next;
    slow.next = head;
    head = slow;
    return head;
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
    sixth.next = seventh;
    head = moveMidNodePointer(head);
    Node n = head;
    while(n != null){
      System.out.print(n.data + " ");
      n = n.next;
    }
  }
}
