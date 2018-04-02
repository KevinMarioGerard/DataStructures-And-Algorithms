class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static Node iterative(Node head){
    Node n = head;
    while(n != null && n.next != null){
      n.next = n.next.next;
      n = n.next;
    }
    return head;
  }
  public static Node recursive(Node head, Node n){
    if(n.next == null){
      return head;
    }
    n.next = n.next.next;
    if(n == null || n.next == null){
      return head;
    }
    System.out.println(n.data + " " + n.next.data);
    return recursive(head, n.next);
  }
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    Node first = new Node(0);
    Node second = new Node(1);
    Node third = new Node(2);
    Node fourth = new Node(1);
    Node fifth = new Node(3);
    Node sixth = new Node(1);
    Node seventh = new Node(4);
    Node head = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    // sixth.next = seventh;
    Node n = recursive(head, head);
    while(n != null){
      System.out.print(n.data + " ");
      n = n.next;
    }
  }
}
