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
  public void merge(Node head1, Node head2){
    Node temp = null;
    Node prev = head1;
    if(head1.data >= head2.data){
      temp = head2.next;
      head2.next = head1;
      head1 = head2;
      head2 = temp;
      prev = head1;
    }
    this.head = head1;
    head1 = head1.next;
    while(head1 != null && head2 != null){
      System.out.println(head1.data + " " + head2.data);
      if(head1.data >= head2.data){
        temp = head2.next;
        head2.next = prev.next;
        prev.next = head2;
        prev = head2;
        head2 = temp;
      }
      else{
        prev = head1;
        head1 = head1.next;
      }
    }
    while(head2 != null){
      prev.next = head2;
      prev = prev.next;
      head2 = head2.next;
    }
  }
	public static void main(String[] args){
		LinkedList l1 = new LinkedList();
    LinkedList l2 = new LinkedList();
    LinkedList l3 = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
    int j = sc.nextInt();
    if(i != 0){
		    l1.head = new Node(sc.nextInt());
    }
		Node temp = l1.head;
		while(i-- > 1){
			temp.next = new Node(sc.nextInt());
			temp = temp.next;
		}
    if(j != 0){
      l2.head = new Node(sc.nextInt());
    }
    temp = l2.head;
    while(j-- > 1){
			temp.next = new Node(sc.nextInt());
			temp = temp.next;
		}
    // System.out.println(i + " " + j);
    if(i == -1){
      l3.head = l2.head;
    }
    else if(j == -1){
      l3.head = l1.head;
    }
    else if(i == -1 && j == -1){
      l3.head = null;
    }
    else{
      l1.merge(l1.head, l2.head);
      l3.head = l1.head;
    }
		Node n = l3.head;
		while(n != null){
			System.out.print(n.data+"->");
			n = n.next;
		}
		System.out.print('\\');
	}
}
