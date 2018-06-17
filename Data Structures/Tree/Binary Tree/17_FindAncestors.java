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
  public boolean ancestors(Node node, int n){
    if(node == null){
      return false;
    }
    if(node.key == n){
      return true;
    }
    boolean flag1 = ancestors(node.left, n);
    boolean flag2 = ancestors(node.right, n);
    if(flag1 || flag2){
      System.out.print(node.key + " ");
    }
    return flag1 || flag2;
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
    bt.ancestors(bt.root, 7);
  }
}
