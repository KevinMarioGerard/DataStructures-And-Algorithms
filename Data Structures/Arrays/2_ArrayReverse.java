// Time Complexity : O(n/2) = O(n)
import java.util.Arrays;
class ArrayReverse{
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    int l = 0;
    int r = arr.length  - 1;
    while(l < r){
      arr[r] = arr[l] ^ (arr[l] = arr[r]) ^ arr[l];
      r--;
      l++;
    }
    System.out.println(Arrays.toString(arr));
  }
}
