class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
public static Node swap(int x, int y, Node head){
  Node swap1 = null;
  Node swap2 = null;
  Node prev1 = null;
  Node prev2 = null;
  Node prev = head;
  Node n = head;
  boolean flag1 = true;
  boolean flag2 = true;
  while(n != null && (flag1 || flag2)){
    if(n.data == x){
      prev1 = prev;
      swap1 = n;
      flag1 = false;
    }
    if(n.data == y){
      prev2 = prev;
      swap2 = n;
      flag2 = false;
    }
    prev = n;
    n = n.next;
  }
  if(head.data == x){
    prev2.next = swap1;
    head = swap2;
    Node temp = swap1.next;
    swap1.next = swap2.next;
    swap2.next = temp;
    return head;
  }
  if(head.data == y){
    prev1.next = swap2;
    head = swap1;
    Node temp = swap1.next;
    swap1.next = swap2.next;
    swap2.next = temp;
    return head;
  }
  // System.out.println(prev1.data);
  // System.out.println(prev2.data);
  if(prev1 == null || prev2 == null){
    System.out.println("X or Y not in LinkedList");
    return head;
  }
  prev1.next = swap2;
  prev2.next = swap1;
  Node temp = swap1.next;
  swap1.next = swap2.next;
  swap2.next = temp;
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
    head = swap(5, 0, head);
    Node n = head;
    while(n != null){
      System.out.print(n.data + " ");
      n = n.next;
    }
  }
}
