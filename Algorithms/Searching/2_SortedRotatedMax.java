class SortedRotated{
  public static int binarySearch(int[] arr, int low, int high){
    int mid;
    if (low == high)
         return arr[low];

       /* If there are two elements and
          first is greater then the first
          element is maximum */
       if ((high == low + 1) && arr[low] >= arr[high])
          return arr[low];

       /* If there are two elements and
          second is greater then the second
          element is maximum */
       if ((high == low + 1) && arr[low] < arr[high])
          return arr[high];
    mid = (low + high) / 2;
    System.out.println(arr[mid]);
    if(high < low){
      return arr[mid];
    }
    if(arr[mid] > arr[mid - 1] && arr[mid + 1] < arr[mid]){
      return arr[mid];
    }
    if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1])
       return binarySearch(arr, low, mid-1);
     else
       return binarySearch(arr, mid + 1, high);
  }
  public static void main(String[] args){
    int[] arr = {5, 6, 7, 0, 1, 2, 3, 4};
    System.out.println(binarySearch(arr, 0, arr.length - 1));
  }
}
