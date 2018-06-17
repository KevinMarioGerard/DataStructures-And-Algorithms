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
  int index = 1;
  Node root;
  BinaryTree(int key){
    this.root = new Node(key);
  }
  public static void main(String[] args){
    int[] pre = {1, 2, 4, 6, 5, 3};
    char[] preLN = {'N', 'N', 'N', 'L', 'L', 'L'};
    BinaryTree bt = new BinaryTree(pre[0]);
    if(preLN[0] == 'N'){
      bt.construct(pre, preLN, bt.root);
    }
    bt.inOrder(bt.root);
  }
  void inOrder(Node node){
    if(node == null)
      return;
    inOrder(node.left);
    System.out.print(node.key + " ");
    inOrder(node.right);
  }
  void construct(int[] pre, char[] preLN, Node node){
    //System.out.println(pre[index]);
    if(node == null)
      return;
    if(preLN[index] == 'L'){
      if(node.left == null){
        node.left = new Node(pre[index]);
        index++;
      }
      if(index >= pre.length)
        return;
      if(node.right == null){
        node.right = new Node(pre[index]);
        index++;
      }
      return;
    }
    if(preLN[index] == 'N'){
      if(node.left == null){
        node.left = new Node(pre[index]);
        index++;
      }
      construct(pre, preLN, node.left);
      construct(pre, preLN, node.right);
      if(index >= pre.length)
        return;
      if(node.right == null){
        node.right = new Node(pre[index]);
        index++;
      }
    }
  }
}
