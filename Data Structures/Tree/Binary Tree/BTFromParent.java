//Construct Tree From Pre Order Traversal
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
  public static void main(String[] args){
    int[] pre = {-1, 0, 0, 1, 1, 3, 4};
    if(pre.length > 0){
      BinaryTree bt = new BinaryTree(0);
      bt.construct(pre, bt.root, 1);
      bt.preOrder(bt.root);
    }
  }
  void preOrder(Node node){
    if(node == null)
      return;
    System.out.print(node.key + " ");
    preOrder(node.left);
    preOrder(node.right);
  }
  void construct(int[] pre, Node node,int index){
    if(node == null)
      return;
    if(index >= pre.length)
      return;
    if(node.key != pre[index]){
      return;
    }
    if(node.left == null)
      node.left = new Node(index++);
    if(index >= pre.length)
      return;
    construct(pre, node.left, index + 1);
    System.out.println(index);
    construct(pre, node.right, index + 2);
    if(node.left != null)
      node.right =  new Node(index);
  }
}
