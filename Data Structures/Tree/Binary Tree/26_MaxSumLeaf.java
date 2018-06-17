import java.util.*;
class Node{
  int key;
  Node left, right;
  Node(int key){
    this.key = key;
    this.left = this.right = null;
  }
}
class BinaryTree{
  Node root;
  BinaryTree(int key){
    this.root = new Node(key);
  }
  int sum = 0;
  String target;
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.root.left.left.right = new Node(8);
    bt.maxSum(bt.root, 0, "");
    System.out.println(bt.sum);
    System.out.println(bt.target + "//");
  }

  public void maxSum(Node node, int sum, String target){
    if(node == null){
      if(sum > this.sum){
        this.sum = sum;
        this.target = target;
      }
      return;
    }
    maxSum(node.left, sum + node.key, target + node.key + "->");
    maxSum(node.right, sum + node.key, target + node.key + "->");
  }
}
