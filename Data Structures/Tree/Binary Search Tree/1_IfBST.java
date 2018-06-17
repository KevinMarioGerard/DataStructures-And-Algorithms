import java.util.*;
class Node{

  int key;
  Node left, right;

  Node(int key){
    this.key = key;
    this.left = this.right = null;
  }
}

class InOrder{
  ArrayList<Integer> arr = new ArrayList<>();
}

class BST{
  Node root;
  InOrder in = new InOrder();
  BST(int key){
    this.root = new Node(key);
  }
  public static void main(String[] args){
    BST tree = new BST(50);
    tree.root.left = new Node(30);
    tree.root.left.left = new Node(20);
    tree.root.right = new Node(70);
    tree.root.right.left = new Node(60);
    tree.root.right.right = new Node(80);
    tree.inOrderCheck(tree.root);
    boolean flag = true;
    for(int i = 0; i < tree.in.arr.size() - 1; i++){
      if(tree.in.arr.get(i) > tree.in.arr.get(i + 1)){
        flag = false;
      }
    }
    if(flag)
      System.out.println("Binary Tree");
    else
      System.out.println("Not a binary Tree");

    if(tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE))
      System.out.println("Binary Tree");
    else
      System.out.println("Not a binary Tree");
  }

  public void inOrderCheck(Node node){
    if(node == null)
      return;
    inOrderCheck(node.left);
    in.arr.add(node.key);
    inOrderCheck(node.right);
  }

  public boolean isBST(Node node, int min, int max){
    if(node == null)
      return true;
    if(node.key < min || node.key > max)
      return false;
    return isBST(node.left, min, node.key - 1) && isBST(node.right, node.key + 1, max);
  }
}
