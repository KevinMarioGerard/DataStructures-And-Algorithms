class Queue{
  Node front;
  Node rear;
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  void enqueue(int data){
    if(front == null){
      Node temp = new Node(data);
      front = temp;
      rear = temp;
      return;
    }
    rear.next = new Node(data);
    rear = rear.next;
    Node n = this.front;
  }
  int dequeue(){
    if(front == null){
      return -1;
    }
    int result = this.front.data;
    this.front = front.next;
    return result;
  }
  public static void main(String[] args){
    Queue q = new Queue();
    q.enqueue(0);
    q.enqueue(1);
    q.enqueue(2);
    System.out.println(q.dequeue());
    //System.out.println(q.dequeue());
    q.enqueue(3);
    System.out.println(q.front.data);
    System.out.println(q.rear.data);
  }
}
