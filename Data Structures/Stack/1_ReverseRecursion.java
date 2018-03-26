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
  static void insert(Stack s, int tmp){
    if(s.isEmpty()){
      s.push(tmp);
    }
    else{
      int x = s.pop();
      insert(s, tmp);
      s.push(x);
    }
  }
  static void reverse(Stack s){
    if(!s.isEmpty()){
      int tmp = s.pop();
      reverse(s);
      System.out.println(tmp);
      insert(s, tmp);
    }
  }

  public static void main(String[] args){
    Stack s = new Stack();
    //s.push(0);
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
    reverse(s);
    System.out.println(Arrays.toString(s.arr));
  }
}
