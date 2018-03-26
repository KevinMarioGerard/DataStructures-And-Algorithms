class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static int getNthNodeEnd(Node head, int index){
    int length = 1;
    Node n = head;
    while(n.next != null){
      length++;
      n = n.next;
    }
    // System.out.println(length);
    int i = length - index;
    n = head;
    while(i-- > 0){
      n = n.next;
    }
    return n.data;
  }
  public static int getNthNodeEndPointer(Node head, int index){
    Node ref = head;
    Node main = head;
    while(index-- > 0){
      ref = ref.next;
    }
    while(ref != null){
      ref = ref.next;
      main = main.next;
    }
    return main.data;
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
    System.out.println(getNthNodeEnd(head, 2));
    System.out.println(getNthNodeEndPointer(head, 2));
  }
}
