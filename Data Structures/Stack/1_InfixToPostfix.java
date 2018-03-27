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
  static int Prec(char c){
    switch(c){
      case '^':
        return 3;
      case '*':
        return 2;
      case '\\':
        return 2;
      case '+':
        return 1;
      case '-':
        return 1;
    }
    return -1;
  }
  static String infixPostfix(String str){
    Stack s = new Stack();
    String result = "";
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == '('){
        s.push(str.charAt(i));
      }
      else if(Character.isLetterOrDigit(str.charAt(i))){
        result += str.charAt(i);
      }
      else if(str.charAt(i) == ')'){
        while(!s.isEmpty() && s.peek() != '('){
          result += s.pop();
        }
        s.pop();
      }
      else{
        while(!s.isEmpty() && Prec(str.charAt(i)) <= Prec(s.peek())){
          result += s.pop();
        }
        s.push(str.charAt(i));
      }
      // System.out.println(result);
      // System.out.println(Arrays.toString(s.arr));
    }
    while(!s.isEmpty()){
      result += s.pop();
    }
    return result;
  }
  public static void main(String[] args){
    String str = "a+b*(c^d-e)^(f+g*h)-i";
    String s  = infixPostfix(str);
    System.out.println(s);
  }
}
