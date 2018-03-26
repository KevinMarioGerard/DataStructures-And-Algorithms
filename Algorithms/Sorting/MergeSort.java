import java.util.Arrays;
class MergeSort{
  public static void mergeSort(int[] arr, int l, int r){
    if(l < r){
      mergeSort(arr, l, (r + l) / 2);
      mergeSort(arr, (r + l) / 2 + 1, r);
      merge(arr, l, (r + l) / 2, r);
    }
  }
  public static void merge(int[] arr, int l, int m, int r){
    //System.out.println(l + " " + r);
    int[] temp = new int[r - l + 1];
    for(int i = l; i <= r; i++){
      temp[i - l] = arr[i];
    }
    //System.out.println(Arrays.toString(temp));
    int i = 0, j = m - l + 1;
    int n1 = m - l + 1;
    int n2 = r - l;
    int k = l;
    //System.out.println(n1 + " " + j + " " + n2);
    while(i < n1 && j <= n2){
      if(temp[i] <= temp[j]){
        arr[k] = temp[i];
        i++;
      }
      else{
        arr[k] = temp[j];
        j++;
      }
      k++;
    }
    while(i < n1){
      arr[k] = temp[i];
      i++;
      k++;
    }
    while(j <= n2){
      arr[k] = temp[j];
      j++;
      k++;
    }
  }
  public static void main(String[] args){
    int[] arr = {9, -3, 2, 8, 21, 11, 12, 9, 7};
    mergeSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}
