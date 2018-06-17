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
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.root.right.left.left = new Node(8);
    bt.getLevel(bt.root, 8, 1);
  }

  public void getLevel(Node node, int key, int level){
    if(node == null){
      return;
    }
    if(node.key == key){
      System.out.println("Level is " + level);
      return;
    }
    getLevel(node.left, key, level + 1);
    getLevel(node.right, key, level + 1);
  }
}
