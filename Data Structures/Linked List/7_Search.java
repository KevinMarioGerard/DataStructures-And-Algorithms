class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static boolean recursive(Node head, int key){
    if(head == null){
      return false;
    }
    if(head.data == key){
      return true;
    }
    return recursive(head.next, key);
  }
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    Node first = new Node(0);
    Node second = new Node(2);
    Node third = new Node(1);
    Node head = first;
    first.next = second;
    second.next = third;
    Node n = head;
    int key = 2;
    boolean ibool = false;
    while(n != null){
      if(n.data == key){
        ibool = true;
        break;
      }
      n = n.next;

    }
    System.out.println(ibool);
    boolean rbool = recursive(head, key);
    System.out.println(rbool);
  }
}
