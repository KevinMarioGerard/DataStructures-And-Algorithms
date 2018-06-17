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
  void printPostOrder(Node node){
    if(node == null){
      return;
    }
    printPostOrder(node.left);
    printPostOrder(node.right);
    System.out.print(node.key + " ");
  }
  void printInOrder(Node node){
    if(node == null){
      return;
    }
    printInOrder(node.left);
    System.out.print(node.key + " ");
    printInOrder(node.right);
  }
  void printpreOrder(Node node){
    if(node == null){
      return;
    }
    System.out.print(node.key + " ");
    printpreOrder(node.left);
    printpreOrder(node.right);
  }
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.printPostOrder(bt.root);
    System.out.println();
    bt.printInOrder(bt.root);
    System.out.println();
    bt.printpreOrder(bt.root);
  }
}
