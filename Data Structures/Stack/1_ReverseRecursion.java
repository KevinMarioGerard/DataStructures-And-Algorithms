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
  static void reverse(Stack s, int x){
    if(s.isEmpty()){
      s.push(x);
      return;
    }
    int tmp = s.pop();
    System.out.println(Arrays.toString(s.arr));
    reverse(s, tmp);
    s.push(tmp);
  }
  public static void main(String[] args){
    Stack s = new Stack();
    s.push(0);
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);
    s.push(7);
    s.push(8);
    s.push(9);
    System.out.println(Arrays.toString(s.arr));
    reverse(s, s.pop());
    System.out.println(Arrays.toString(s.arr));
  }
}
