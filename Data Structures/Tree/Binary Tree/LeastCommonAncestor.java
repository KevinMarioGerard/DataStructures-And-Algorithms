class Node{
  int data;
  Node left, right;
  Node(int data){
    this.data = data;
    this.left = this.right = null;
  }
}
class BinaryTree{
  Node root;
  boolean b1, b2;
  int lcs;
  BinaryTree(int data){
    root = new Node(data);
  }
  boolean leastCommon(Node node, int n1, int n2){
    if(node == null)
      return false;
    if(node.data == n1 || node.data == n2)
      return true;
    boolean left = leastCommon(node.left, n1, n2);
    boolean right = leastCommon(node.right, n1, n2);
    System.out.println(node.data + " " + left + " " + right);
    if(left && right){
      lcs = node.data;
      return false;
    }
    return left || right;
  }
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.root.left.right.left = new Node(8);
    bt.leastCommon(bt.root, 4, 7);
    System.out.println(bt.lcs);
  }
}
