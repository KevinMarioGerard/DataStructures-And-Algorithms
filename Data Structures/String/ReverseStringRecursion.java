class ReverseStringRecursion{
  public static String reverse(String s, int n){
    if(n == 0){
      return  String.valueOf(s.charAt(n));
    }
    // System.out.println(s.charAt(n));
    return String.valueOf(s.charAt(n)) + reverse(s, n-1);
  }
  public static void main(String[] args){
    String s = "Kevin Mario Gerard";
    System.out.println(reverse(s, s.length() - 1));
  }
}
