import java.util.Stack;
import java.util.Arrays;
class StockSpan{
  public static int[] stockSpan(int[] arr){
    int[] output = new int[arr.length];
    Stack<Integer> s = new Stack<>();
    s.push(0);
    output[0] = 1;
    for(int i = 1; i < arr.length; i++){
      while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
        s.pop();
      }
      output[i] = s.isEmpty()? i + 1: i - s.peek();
      s.push(i);
    }
    return output;
  }
  public static void main(String[] args){
    // int[] arr = {100, 80, 60, 70, 60, 75, 85};
    int[] arr = {10, 4, 5, 90, 120, 80};
    int[] output = stockSpan(arr);
    System.out.println(Arrays.toString(output));
  }
}
