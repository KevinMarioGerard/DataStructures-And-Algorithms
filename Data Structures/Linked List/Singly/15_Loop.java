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
  public static boolean detectLoopHashing(Node n){
    HashSet<Node> hs = new HashSet<>();
    while(n != null){
      if(hs.contains(n)){
        return true;
      }
      hs.add(n);
      n = n.next;
    }
    return false;
  }
  public static boolean detectLoopFloyd(Node n){
    Node one = n;
    Node two = n;
    while(two != null && two.next != null){
      one = one.next;
      two = two.next.next;
      if(one == two){
        return true;
      }
    }
    return false;
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
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;
    // seventh.next = third;
    System.out.println(detectLoopHashing(head));
    System.out.println(detectLoopFloyd(head));
  }
}
