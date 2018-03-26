import java.util.Arrays;
class JugglingAlgo{
  public static int gcd(int a, int b){
    if(b ==  0){
      return a;
    }
    else{
      // System.out.println(b + " " + (a % b));
      return gcd(b, a % b);
    }
  }
  public static void main(String[] args){
    // System.out.println(gcd(4, 12));
  }
}
