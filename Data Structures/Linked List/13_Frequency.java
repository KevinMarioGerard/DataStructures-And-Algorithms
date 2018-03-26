class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static int iterate(Node n, int key){
    int frequency = 0;
    while(n != null){
      if(n.data == key) frequency++;
      n = n.next;
    }
    return frequency;
  }
  public static int recursive(Node n, int key){
    if(n == null){
      return 0;
    }
    if(n.data == key){
      return recursive(n.next, key) + 1;
    }
    return recursive(n.next, key);
  }
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    Node first = new Node(0);
    Node second = new Node(1);
    Node third = new Node(2);
    Node fourth = new Node(1);
    Node fifth = new Node(1);
    Node sixth = new Node(5);
    Node seventh = new Node(7);
    Node head = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;
    System.out.println(iterate(head, 1));
    System.out.println(recursive(head, 1));
  }
}
