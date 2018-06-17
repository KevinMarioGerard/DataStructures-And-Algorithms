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
    Stack<Node> st = new Stack<Node>();
    st.push(node);
    Node prev = null;
    while (st.size() > 0)
    {
        Node curr = st.peek();
        if (prev == null || prev.left == curr || prev.right == curr){
            if (curr.left != null)
                st.push(curr.left);
            else if (curr.right != null)
                st.push(curr.right);
            else{
                st.pop();
                System.out.print(curr.key + " ");
            }
        }
        else if (curr.left == prev){
            if (curr.right != null)
                st.push(curr.right);
            else{
                st.pop();
                System.out.print(curr.key + " ");
            }
        }
        else if (curr.right == prev){
            st.pop();
            System.out.print(curr.key + " ");
        }
        prev = curr;
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
