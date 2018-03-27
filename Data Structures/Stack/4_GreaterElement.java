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
  static void greaterElement(int[] arr){
    Stack s = new Stack();
    s.push(arr[0]);
    for(int i = 1; i < arr.length; i++){
      while(!s.isEmpty()){
        if(s.peek() < arr[i]){
          System.out.println(s.pop() + " -> " + arr[i]);
        }
        else if(s.peek() > arr[i]){
          break;
        }
      }
      s.push(arr[i]);
    }
    while(!s.isEmpty()){
      System.out.println(s.pop() + " -> " + -1);
    }
  }
  public static void main(String[] args){
    int[] arr = {2, 5, 3, 7, 6};
    greaterElement(arr);
  }
}
