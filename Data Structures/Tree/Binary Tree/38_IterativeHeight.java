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
  public void maxHeight(Node node){
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    q.add(new Node(-1));
    int height = 0;
    while(!q.isEmpty()){
      int l = q.size();
      while(l-- > 0){
        Node temp = q.poll();
        if(temp.left != null)
          q.add(temp.left);
        if(temp.right != null)
          q.add(temp.right);
      }
      height++;
    }
    System.out.println(height - 1);
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
    bt.maxHeight(bt.root);
  }
}
