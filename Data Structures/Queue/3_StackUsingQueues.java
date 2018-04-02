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
  static void push(int data, Queue q){
    Queue temp = new Queue();
    while(q.front != null){
      temp.enqueue(q.dequeue());
    }
    q.enqueue(data);
    while(temp.front != null){
      q.enqueue(temp.dequeue());
    }
  }
  static int pop(Queue q){
    return q.dequeue();
  }
  public static void main(String[] args){
    Queue q = new Queue();
    push(0, q);
    push(1, q);
    push(2, q);
    push(3, q);
    System.out.println(pop(q));
    System.out.println(pop(q));
    System.out.println(pop(q));
    push(4, q);
    System.out.println(pop(q));
  }
}
