class Node{

  int key;
  Node left, right;

  Node(int key){
    this.key = key;
    this.left = this.right = null;
  }

}

class BST{
  Node root;
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
    System.out.println(tree.findMin(tree.root));
    System.out.println(tree.findMax(tree.root));
  }
  public int findMin(Node node){
    if(node.left == null)
      return node.key;
    return findMin(node.left);
  }
  public int findMax(Node node){
    if(node.right == null)
      return node.key;
    return findMax(node.right);
  }
}
