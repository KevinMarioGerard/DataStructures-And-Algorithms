//To find sum of the longest bloodline
import java.util.*;
class Node{
  int key;
  Node left, right;
  Node(int key){
    this.key = key;
    this.left = this.right = null;
  }
}
class MaxLevel{
  int level = 0;
  int sum = 0;
}
class BinaryTree{
  Node root;
  MaxLevel max = new MaxLevel();
  BinaryTree(int key){
    this.root = new Node(key);
  }

  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.root.left.left.left = new Node(8);
    bt.sumOfLongest(bt.root, 1, 0);
    System.out.println(bt.max.sum);
  }
  void sumOfLongest(Node node, int level, int sum){
    if(node == null)
      return;
    sum += node.key;
    if(node.left == null && node.right == null){
      if(level > max.level){
        max.level = level;
        max.sum = sum;
      }
      return;
    }
    sumOfLongest(node.left, level + 1, sum);
    sumOfLongest(node.right, level + 1, sum);
  }
}
