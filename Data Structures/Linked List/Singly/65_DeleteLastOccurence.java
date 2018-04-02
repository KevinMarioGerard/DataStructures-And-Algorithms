class LinkedList{
  Node head;
  static class Node{
    Node next;
    int data;
    Node(int data){
      this.data = data;
    }
  }
  public static Node delLastNode(Node head, int key){
    Node temp1 = head;
    Node temp2 = null;
    Node prev = null;
    while(temp1 != null){
      if(temp1.data == key){
        prev = temp2;
      }
      temp2 = temp1;
      temp1 = temp1.next;
    }
    if(prev == null){
      return head.next;
    }
    prev.next = prev.next.next;
    return head;
  }
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    int[] arr = {1, 2, 3, 5, 2, 10};
    ll.head = new Node(arr[0]);
    Node temp = ll.head;
    for(int i = 1; i < arr.length; i++){
      temp.next = new Node(arr[i]);
      temp = temp.next;
    }
    ll.head = delLastNode(ll.head, 10);
    Node n = ll.head;
    while(n != null){
      System.out.print(n.data + " ");
      n = n.next;
    }
  }
}
