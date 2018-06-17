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

  public int recursive(Node node, int depth){
    if(node == null){
      return 0;
    }
    int left = recursive(node.left, depth) + 1;
    int right = recursive(node.right, depth) + 1;
    return Math.max(left, right);
  }

  public int maxDiameter(Node node){
    if(node == null){
      return 0;
    }
    int lheight = recursive(node.left, 0);
    int rheight = recursive(node.right, 0);
    int ldiameter = maxDiameter(node.left);
    int rdiameter = maxDiameter(node.right);
    return(Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter)));
  }
  int max = Integer.MIN_VALUE;
  public int diameter(Node node){
    if(node == null){
      return 0;
    }
    int lheight = diameter(node.left);
    int rheight = diameter(node.right);
    if(max < lheight+rheight+1) max = lheight+rheight+1;
    return Math.max(lheight,rheight)+1;
  }
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.root.left.left.right = new Node(8);
    System.out.println(bt.maxDiameter(bt.root));
    bt.diameter(bt.root);
    System.out.println(bt.max);
  }
}
