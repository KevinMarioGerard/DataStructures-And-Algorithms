import java.util.Arrays;
class Stack{
  int top;
  int[] arr;
  Stack(){
    this.top = -1;
    this.arr = new int[20];
  }
  void push(int ele){
    this.arr[++this.top] = ele;
  }
  int pop(){
    int k = arr[top--];
    arr[top + 1] = 0;
    return k;
  }
  int peek(){
    return this.arr[this.top];
  }
  boolean isEmpty(){
    if(this.top == -1){
      return true;
    }
    return false;
  }
  static void enqueue(Stack s, int input){
    if(s.isEmpty()){
      s.push(input);
      return;
    }
    int tmp = s.pop();
    enqueue(s, input);
    s.push(tmp);
  }
  static int dequeue(Stack s){
    return s.pop();
  }
  public static void main(String[] args){
    Stack s = new Stack();
    for(int i = 0; i <= 10; i++){
      enqueue(s, i);
      System.out.println(Arrays.toString(s.arr));
    }
    for(int i = 0; i <= 10; i++){
      System.out.println(dequeue(s));
    }

  }
}
