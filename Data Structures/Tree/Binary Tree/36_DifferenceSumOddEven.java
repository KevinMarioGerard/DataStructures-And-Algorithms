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
  int even = 0;
  int odd = 0;
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
    bt.difference(bt.root, 1);
    System.out.println(bt.even - bt.odd);
  }

    public void difference(Node node, int level){
      if(node == null){
        return;
      }
      if(level % 2 == 0)
        even += node.key;
      else
        odd += node.key;
      difference(node.left, level + 1);
      difference(node.right, level + 1);

    }

}
