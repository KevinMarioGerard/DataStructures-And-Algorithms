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
  static Stack sortStack(Stack s){
    Stack temp = new Stack();
    while(!s.isEmpty()){
      // System.out.println(Arrays.toString(s.arr));
      int x = s.pop();
      while(!temp.isEmpty() && temp.peek() > x){
        s.push(temp.pop());
      }
      temp.push(x);
    }
    return temp;
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
    s = sortStack(s);
    System.out.println(Arrays.toString(s.arr));
  }
}
