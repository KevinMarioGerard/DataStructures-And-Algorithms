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
  int level = 0;
  int value;
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
    bt.root.right.left.left.left = new Node(9);
    bt.deepLeaf(bt.root, false, 1);
    System.out.println(bt.value);
  }
  public void deepLeaf(Node node, boolean flag, int level){
    if(node == null)
      return;
    if(flag && (this.level < level)){
      value = node.key;
      this.level = level;
    }
    deepLeaf(node.left, true, level + 1);
    deepLeaf(node.right, false, level + 1);
  }
}
