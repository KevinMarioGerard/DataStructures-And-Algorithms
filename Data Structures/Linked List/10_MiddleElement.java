class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static int getMidNodePointer(Node head){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow.data;
  }
  public static int getMidNodeCount(Node head){
    int count = 1;
    Node n = head;
    while(n.next != null){
      count++;
      n = n.next;
    }
    count /= 2;
    n = head;
    while(count-- != 0){
      n = n.next;
    }
    return n.data;
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
    System.out.println(getMidNodeCount(head));
    System.out.println(getMidNodePointer(head));
  }
}
