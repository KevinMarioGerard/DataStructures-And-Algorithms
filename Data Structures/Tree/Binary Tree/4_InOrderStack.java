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

  void inorder(Node node){
    Stack<Node> st = new Stack<>();
    Node curr = node;
    while(curr != null){
      st.push(curr);
      curr = curr.left;
    }
    while(st.size() > 0){
      curr = st.pop();
      System.out.print(curr.key + " ");
      if(curr.right != null){
        curr = curr.right;
        while(curr != null){
          st.push(curr);
          curr = curr.left;
        }
      }
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
    bt.inorder(bt.root);
  }
}
