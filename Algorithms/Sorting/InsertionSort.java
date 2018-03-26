import java.util.Arrays;
class InsertionSort{
  public static void main(String[] args){
    int[] arr = {9, -3, 2, 8, 21, 11, 12, 9, 7, 8, 6, 8, 1, -21, -17};
    for(int i = 1; i < arr.length; i++){
      int key = arr[i];
      int j;
      for(j = i - 1; j >= 0; j--){
        if(key > arr[j]){
          break;
        }
        else{
          arr[j + 1] = arr[j];
        }
      }
      arr[j + 1] = key;
    }
    System.out.println(Arrays.toString(arr));
  }
}
