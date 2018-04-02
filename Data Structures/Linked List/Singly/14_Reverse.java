class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static Node reverseIterate(Node head){
    Node first = head;
    Node second = null;
    Node third = null;
    while(first != null){
      third = first.next;
      first.next = second;
      second = first;
      first = third;
    }
    return second;
  }
  public static Node reverseRecursive(Node curr, Node prev){
    if(curr == null){
      return prev;
    }
    Node n = curr.next;
    curr.next = prev;
    return reverseRecursive(n, curr);
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
    head = reverseIterate(head);
    Node n = head;
    while(n != null){
      // System.out.println(1);
      System.out.print(n.data + " ");
      n = n.next;
    }
    System.out.println();
    n = reverseRecursive(head, null);
    while(n != null){
      // System.out.println(1);
      System.out.print(n.data + " ");
      n = n.next;
    }
  }
}
