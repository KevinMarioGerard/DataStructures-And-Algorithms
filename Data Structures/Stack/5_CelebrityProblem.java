import java.util.Stack;
import java.util.Arrays;
class Celebrity{
  static boolean relation(int[][] arr, int a, int b){
    //System.out.print(arr[a][b] + "----");
    return arr[a][b] == 1 ? true: false;
  }
  static int findCelebrity(int[][] arr){
    int i = 0;
    Stack<Integer> s = new Stack<>();
    while(i < arr.length){
      s.push(i);
      i++;
    }
    while(s.size() != 1){
      int a = s.pop();
      int b = s.pop();
      if(relation(arr, a, b)){
        s.push(b);
      }
      else{
        s.push(a);
      }
      System.out.println(s.toString());
    }
    int c = s.pop();
    for(i = 0; i < arr.length; i++){
      if(i != c && (relation(arr, c, i) || !relation(arr, i, c))){
        return -1;
      }
    }
    return c;
  }
  public static void main(String[] args){
    int[][] arr = {{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}};
    int id = findCelebrity(arr);
    System.out.println(id);
  }
}
