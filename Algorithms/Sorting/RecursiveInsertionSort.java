import java.util.Arrays;
class RecursiveInsertionSort{
  private static int[] insertion(int[] arr, int n){
    if(n == arr.length){
      return arr;
    }
    int j;
    int key = arr[n];
    for(j = n - 1; j >= 0; j--){
      if(key < arr[j]){
        arr[j + 1] = arr[j];
      }
      else{
        break;
      }
    }
    arr[j + 1] = key;
    return insertion(arr, n + 1);
  }
  public static void main(String[] args){
    int[] arr = {9, -3, 2, 8, 21, 11, 12, 9, 7, 8, 6, 8, 1, -21, -17};
    System.out.println(Arrays.toString(insertion(arr, 1)));
  }
}
