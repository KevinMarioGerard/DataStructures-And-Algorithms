// Time complexity : O(n * num_of_rotations)
import java.util.Arrays;
class ArrayLeftRotation{
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int num_of_rotations = 2;
    for(int i = 0; i < num_of_rotations; i++){
      int value = arr[0];
      for(int j = 0; j < arr.length - 1; j++){
        arr[j] = arr[j + 1];
      }
      arr[arr.length - 1] = value;
      // System.out.println(Arrays.toString(arr));
    }
    System.out.println(Arrays.toString(arr));
  }
}
