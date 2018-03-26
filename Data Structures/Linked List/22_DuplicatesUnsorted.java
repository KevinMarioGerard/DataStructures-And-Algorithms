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
  public static Node removeDuplicates(Node head){
    HashSet<Integer> hs = new HashSet<>();
    Node n = head;
    Node prev = n;
    while(n != null){
      if(hs.contains(n.data)){
        prev.next = n.next;
      }
      else{
        hs.add(n.data);
      }
      prev = n;
      n = n.next;
    }
    return head;
  }
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    Node first = new Node(1);
    Node second = new Node(1);
    Node third = new Node(5);
    Node fourth = new Node(1);
    Node fifth = new Node(2);
    Node sixth = new Node(3);
    Node seventh = new Node(2);
    Node head = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;
    head = removeDuplicates(head);
    Node n = head;
    while(n != null){
      System.out.print(n.data + " ");
      n = n.next;
    }
  }
}
