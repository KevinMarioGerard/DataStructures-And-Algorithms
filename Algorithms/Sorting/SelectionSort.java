import java.util.Arrays;
class SelectionSort{
  public static void main(String[] args){
    int[] arr = {9, -3, 2, 8, 21, 11, 12, 9, 7, 8, 6, 8, 1, -21, -17};
    for(int i = 0; i < arr.length; i++){
      int min = arr[i];
      int min_index = i;
      for(int j = i + 1; j <  arr.length; j++){
        if(arr[j] < min){
          min = arr[j];
          min_index = j;
        }
      }
      // System.out.println(min + " " + min_index);
      arr[i] = arr[min_index] ^ (arr[min_index] = arr[i]) ^ arr[min_index];
    }
    System.out.println(Arrays.toString(arr));
  }
}
