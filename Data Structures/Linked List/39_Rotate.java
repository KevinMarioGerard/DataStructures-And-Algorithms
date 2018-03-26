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
  public static Node rotate(Node head, int no){
    while(no-- > 0){
      Node n = head;
      Node prev = n;
      while(n.next != null){
        prev = n;
        n = n.next;
      }
      prev.next = null;
      n.next = head;
      head = n;
    }
    return head;
  }
  public static Node countRotate(Node head, int no){
    int length = 0;
    Node n = head;
    while(n != null){
      length++;
      n = n.next;
    }
    //System.out.println(length);
    int traverse = length - (no % length);
    n = head;
    Node prev = n;
    // no % length if number f rotations is greater than list length
    while(traverse-- > 0){
      prev = n;
      n = n.next;
    }
    prev.next = null;
    Node temp = n;
    while(n.next != null){
      n = n.next;
    }
    n.next = head;
    head = temp;
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
    ll.head = countRotate(ll.head, 11);
    while(ll.head != null){
      System.out.print(ll.head.data + " ");
      ll.head = ll.head.next;
    }
  }
}
