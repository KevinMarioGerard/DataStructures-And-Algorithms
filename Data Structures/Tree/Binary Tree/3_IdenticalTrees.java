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
    bt.root.left.right.left = new Node(8);
    BinaryTree bt1 = new BinaryTree(1);
    bt1.root.left = new Node(2);
    bt1.root.right = new Node(3);
    bt1.root.left.left = new Node(4);
    bt1.root.left.right = new Node(5);
    bt1.root.right.left = new Node(6);
    bt1.root.right.right = new Node(7);
    bt1.root.left.right.left = new Node(8);
    if(bt.identity(bt.root, bt.root))
      System.out.println("Identical");
    else
      System.out.println("Not Identical");
    bt1.root.left.right.right = new Node(9);
    if(bt.identity(bt.root, bt1.root))
      System.out.println("Identical");
    else
      System.out.println("Not Identical");
  }

  public boolean identity(Node lnode, Node rnode){
    if(lnode == null && rnode == null)
      return true;
    if(lnode == null || rnode == null || lnode.key != rnode.key)
      return false;
    if(lnode != null){
      System.out.print(lnode.key + " ");
    }
    if(rnode != null)
      System.out.println(rnode.key);
    return identity(lnode.left, rnode.left) && identity(lnode.right, rnode.right);
  }
}
