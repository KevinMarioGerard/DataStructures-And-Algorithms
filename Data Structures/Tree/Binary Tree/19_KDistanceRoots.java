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
  public void levelOrder(Node node, int k){
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    int height = 0;
    q.add(new Node(-1));
    while(!q.isEmpty()){
      Node temp = q.poll();
      if(temp.key == -1){
        if(q.isEmpty()){
          break;
        }
        q.add(new Node(-1));
        height++;
        continue;
      }
      if(height == k){
        System.out.print(temp.key + " ");
      }
      if(temp.left != null)
        q.add(temp.left);
      if(temp.right != null)
        q.add(temp.right);

    }
  }
  public static void recursion(Node node, int k, int height){
    if(node == null){
      return;
    }
    if(height == k){
      System.out.print(node.key + " ");
      return;
    }
    recursion(node.left, k, height + 1);
    recursion(node.right, k, height + 1);
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
    bt.levelOrder(bt.root, 2);
    System.out.println();
    bt.recursion(bt.root, 2, 0);
  }
}
