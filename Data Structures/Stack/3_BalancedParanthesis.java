import java.util.Arrays;
class Stack{
  int top;
  char[] arr;
  Stack(){
    this.top = -1;
    this.arr = new char[50];
  }
  void push(char ele){
    this.arr[++this.top] = ele;
  }
  char pop(){
    char k = arr[top--];
    arr[top + 1] = 0;
    return k;
  }
  char peek(){
    return this.arr[this.top];
  }
  boolean isEmpty(){
    if(this.top == -1){
      return true;
    }
    return false;
  }
  static String balance(String str){
    Stack s = new Stack();
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
        s.push(str.charAt(i));
      }
      else{
        if(str.charAt(i) == '}'){
          if(s.isEmpty() || s.peek() != '{'){
            return "Not balanced";
          }
          s.pop();
        }
        if(str.charAt(i) == ')'){
          if(s.isEmpty() || s.peek() != '('){
            return "Not balanced";
          }
          s.pop();
        }
        if(str.charAt(i) == ']'){
          if(s.isEmpty() || s.peek() != '['){
            return "Not balanced";
          }
          s.pop();
        }
      }
    }
    if(!s.isEmpty()){
      return "Not balanced";
    }
    return "Balanced";
  }
  public static void main(String[] args){
    String str = "{()}{[][]";
    String s  = balance(str);
    System.out.println(s);
  }
}
