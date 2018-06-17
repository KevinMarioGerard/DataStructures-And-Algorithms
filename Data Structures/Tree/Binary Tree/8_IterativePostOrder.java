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
  void postorder(Node node){
    Stack<Node> st1 = new Stack<>();
    Stack<Node> st2 = new Stack<>();
    st1.push(node);
    while(st1.size() > 0){
      st2.push(st1.pop());
      if(st2.peek().left != null)
        st1.push(st2.peek().left);
      if(st2.peek().right != null)
        st1.push(st2.peek().right);
    }
    while(st2.size() > 0){
      System.out.print(st2.pop().key + " ");
    }
  }
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.postorder(bt.root);
  }
}
