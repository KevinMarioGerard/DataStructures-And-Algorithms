class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static boolean iterative(Node head1, Node head2){
    while(head1 != null && head2 != null){
      if(head1.data != head2.data){
        return false;
      }
      head1 = head1.next;
      head2 = head2.next;
    }
    return (head1 == null) && (head2 == null);
  }
  public static boolean recursive(Node head1, Node head2){
    if(head1 == null && head2 == null){
      return true;
    }
    if(head1 == null || head2 == null){
      return false;
    }
    if(head1.data == head2.data){
      return recursive(head1.next, head2.next);
    }
    else{
      return false;
    }
  }
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    Node first = new Node(0);
    Node second = new Node(1);
    Node third = new Node(2);
    Node fourth = new Node(0);
    Node fifth = new Node(1);
    Node sixth = new Node(3);
    Node seventh = new Node(6);
    Node head1 = first;
    first.next = second;
    second.next = third;
    Node head2 = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    //sixth.next = seventh;
    System.out.println(iterative(head1, head2));
    System.out.println(recursive(head1, head2));
  }
}
