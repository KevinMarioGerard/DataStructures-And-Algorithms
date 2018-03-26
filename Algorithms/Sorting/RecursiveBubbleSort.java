import java.util.Arrays;
class RecursiveBubbleSort{
  public static int[] bubble(int[] arr, int n){
    if(n == 1){
      return arr;
    }
    for(int j = 0; j < n - 1; j++){
      if(arr[j] > arr[j + 1]){
        arr[j + 1] = arr[j] ^ (arr[j] = arr[j + 1]) ^ arr[j];
      }
    }
    return bubble(arr, n - 1);
  }
  public static void main(String[] args){
    int[] arr = {9, -3, 2, 8, 21, 11, 12, 9, 7, 8, 6, 8, 1, -21, -17};
    System.out.println(Arrays.toString(bubble(arr, arr.length)));
  }
}
