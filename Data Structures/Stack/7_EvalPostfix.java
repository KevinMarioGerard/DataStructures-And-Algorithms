import java.util.Arrays;
class Stack{
  int top;
  int[] arr;
  Stack(){
    this.top = -1;
    this.arr = new int[50];
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
  static int evalPostfix(String str){
    Stack s = new Stack();
    for(int i = 0; i < str.length(); i++){
      if(Character.isDigit(str.charAt(i))){
        s.push(Integer.parseInt("" + str.charAt(i)));
      }
      else{
        int val1 = s.pop();
        int val2 = s.pop();
        switch(str.charAt(i)){
          case '+':
            s.push(val2 + val1);
            break;
          case '-':
            s.push(val2 - val1);
            break;
          case '*':
            s.push(val2 * val1);
            break;
          case '/':
            s.push(val2 / val1);
            break;
          case '^':
            s.push(val2 ^ val1);
            break;
        }
        System.out.println(Arrays.toString(s.arr));
      }
    }
    return s.pop();
  }
  public static void main(String[] args){
    String str = "231*+9-";
    System.out.println(evalPostfix(str));
  }
}
