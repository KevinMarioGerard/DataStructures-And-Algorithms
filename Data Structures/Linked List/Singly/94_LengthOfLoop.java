class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static int lengthHashing(Node slow){
    Node fast = slow.next;
    Node n1 = null;
    while(fast != null && fast.next != null){
      if(fast == slow){
        n1 = slow;
        break;
      }
      fast = fast.next.next;
      slow = slow.next;
    }
    if(n1 == null){
      return 0;
    }
    int count = 1;
    slow = n1.next;
    while(slow != n1){
      count++;
      slow = slow.next;
    }
    return count;
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
    ll.head = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;
    seventh.next = fifth;
    System.out.println(lengthHashing(ll.head));
  }
}
