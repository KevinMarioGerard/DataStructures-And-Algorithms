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
  static void sortInsert(Stack s, int x){
    if(s.isEmpty() || x > s.peek()){
      s.push(x);
      return;
    }
    int temp = s.pop();
    sortInsert(s, x);
    s.push(temp);
  }
  static void sortStack(Stack s){
    if(!s.isEmpty()){
      int x = s.pop();
      sortStack(s);
      sortInsert(s, x);
    }
  }
  public static void main(String[] args){
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(-1);
    s.push(5);
    s.push(6);
    s.push(7);
    s.push(-3);
    s.push(0);
    s.push(3);
    s.push(7);
    System.out.println(Arrays.toString(s.arr));
    sortStack(s);
    System.out.println(Arrays.toString(s.arr));
  }
}
