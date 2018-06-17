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
    BST tree1 = new BST(50);
    tree1.root.left = new Node(30);
    tree1.root.left.left = new Node(20);
    tree1.root.right = new Node(70);
    tree1.root.right.left = new Node(60);
    tree1.root.right.right = new Node(80);
    System.out.println(tree.check(tree, tree1));
  }
   public boolean check(BST root1, BST root2){
     root1.identical(root1.root);
     root2.identical(root2.root);
     if(root1.in.arr.size() != root2.in.arr.size())
      return false;
    for(int i = 0; i < root1.in.arr.size(); i++){
      if(root1.in.arr.get(i) != root2.in.arr.get(i))
        return false;
    }
    return true;
   }
   public void identical(Node node){
     if(node == null){
       return;
     }
     identical(node.left);
     this.in.arr.add(node.key);
     identical(node.right);
   }
}
