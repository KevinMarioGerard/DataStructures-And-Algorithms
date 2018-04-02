import java.util.Arrays;
class kStack{
  int[] top;
  int[] arr = new int[20];
  int[] pointer;
  int temp = 0;
  kStack(int k){
    this.top = new int[k];
    this.pointer = new int[20];
    for(int i = 0; i < 20; i++){
      this.pointer[i] = i + 1;
    }
    for(int i = 0; i < k; i++){
      top[i] = -1;
    }
  }
  void push(int k, int data){
    if(temp == 21){
      System.out.println("Stack full");
      return;
    }
    int i = temp;
    temp = pointer[i];
    arr[i] = data;
    pointer[i] = top[k];
    top[k] = i;
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(top));
    System.out.println(Arrays.toString(pointer));
  }
  int pop(int k){
    if(top[k] == -1){
      System.out.println("Empty stack");
      return -1;
    }
    int result = arr[top[k]];
    arr[top[k]] = 0;
    int i = top[k];
    top[k] = pointer[i];
    pointer[i] = temp;
    temp = i;
    return result;
  }
  public static void main(String[] args){
    kStack s = new kStack(2);
    s.push(0, 1);
    s.push(0, 2);
    s.push(1, 1);
    System.out.println(s.pop(0));
    s.push(0, 3);
    s.push(0, 4);
    System.out.println(s.pop(1));
    System.out.println(s.pop(0));
    System.out.println(Arrays.toString(s.arr));
    System.out.println(Arrays.toString(s.top));
    System.out.println(Arrays.toString(s.pointer));
  }
}
