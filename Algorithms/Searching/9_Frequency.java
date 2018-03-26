class Frequency{
  public static int binarySearch(int[] arr, int key, boolean flag){
    int low = 0, high = arr.length - 1;
    int mid;
    if(flag){
      while(low <= high){
        mid = (low + high) / 2;
        System.out.println(arr[mid]);
        if(arr[mid] == key){
          if(mid == 0){
            return mid;
          }
          if(arr[mid - 1] != key){
            return mid;
          }
          else{
            high = mid - 1;
          }
        }
        else if(arr[mid] < key){
          low = mid + 1;
        }
        else if(arr[mid] > key){
          high = mid - 1;
        }
      }
      return -1;
    }
    else{
      while(low <= high){
        mid = (low + high) / 2;
        System.out.println(arr[mid]);
        if(arr[mid] == key){
          if(mid == arr.length){
            return mid;
          }
          if(arr[mid + 1] != key){
            return mid;
          }
          else{
            low = mid + 1;
          }
        }
        else if(arr[mid] < key){
          low = mid + 1;
        }
        else if(arr[mid] > key){
          high = mid - 1;
        }
      }
    }
    return 0;
  }
  public static void main(String[] args){
    int[] arr = {1, 1, 2, 2, 2, 2, 3, 4, 5, 5, 5};
    int key = 2;
    int start = binarySearch(arr, key, true);
    if(start == -1){
      System.out.println("Not Found");
    }
    else{
      int finish = binarySearch(arr, key, false);
      System.out.println(finish - start + 1);
    }
  }
}
