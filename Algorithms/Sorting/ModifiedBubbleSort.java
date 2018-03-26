import java.util.Arrays;
class ModifiedBubbleSort{
  public static void main(String[] args){
    int[] arr = {9, -3, 2, 8, 21, 11, 12, 9, 7, 8, 6, 8, 1, -21, -17};
    int[] arr2 = {2, 1, 3, 4, 5};
    for(int i = 0; i < arr2.length - 1; i++){
      boolean flag = true;
      for(int j = 0; j < arr2.length - i - 1; j++){
        if(arr2[j] > arr2[j + 1]){
          arr2[j + 1] = arr2[j] ^ (arr2[j] = arr2[j + 1]) ^ arr2[j];
          flag = false;
        }
        // System.out.println(Arrays.toString(arr));
      }
      System.out.println(Arrays.toString(arr2));
      if(flag){
        break;
      }
    }
    System.out.println(Arrays.toString(arr2));
  }
}
