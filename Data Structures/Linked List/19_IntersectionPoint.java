class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static int getLength(Node n){
    int count = 0;
    while(n != null){
      count++;
      n = n.next;
    }
    return count;
  }
  public static int intersectionPoint(Node head1, Node head2){
    int length1 = getLength(head1);
    int length2 = getLength(head2);
    if(length1 > length2){
      int i = length1 - length2;
      while(i-- > 0){
        head1 = head1.next;
      }
      while(head1 != head2){
        head1 = head1.next;
        head2 = head2.next;
      }
      return head1.data;
    }
    else if(length1 < length2){
      int i = length2 - length1;
      while(i-- > 0){
        head2 = head2.next;
      }
      while(head1 != head2){
        head1 = head1.next;
        head2 = head2.next;
      }
      return head1.data;
    }
    return -1;
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
    Node head1 = first;
    first.next = second;
    second.next = third;
    //third.next = fourth;
    Node head2 = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;
    //seventh.next = third;
    System.out.println(intersectionPoint(head1, head2));
  }
}
