import java.util.*;
class LinkedList{
  Node head;
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static Node move(Node head, int key){
    
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
    ll.head = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;
    ll.head = move(ll.head, 2);
    while(ll.head != null){
      System.out.print(ll.head.data + " ");
      ll.head = ll.head.next;
    }
  }
}
