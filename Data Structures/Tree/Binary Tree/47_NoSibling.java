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
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    //bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.root.right.left.left = new Node(8);
    bt.noSibling(bt.root);
  }

  public void noSibling(Node node){
    if(node == null){
      return;
    }
    if(node.left == null && node.right != null){
      System.out.println(node.right.key);
    }
    if(node.right == null && node.left != null){
      System.out.println(node.left.key);
    }

    noSibling(node.left);
    noSibling(node.right);
  }

}
