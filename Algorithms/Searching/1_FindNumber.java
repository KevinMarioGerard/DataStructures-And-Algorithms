class FindNumber{
  public static void main(String[] args){
    int[] arr = {1, 2, 3, 5, 6};
    int n = ((arr.length + 1) * (arr.length + 2)) / 2;
    // System.out.println(n);
    for(int i = 0; i < arr.length; i++){
      n -= arr[i];
    }
    // System.out.println(n);
    int xor = 0;
    for(int i = 0; i < arr.length; i++){
      xor = xor ^ arr[i];
      xor = xor ^ (i + 1);
    }
    xor = xor ^ arr.length + 1;
    System.out.println(xor);
  }
}
