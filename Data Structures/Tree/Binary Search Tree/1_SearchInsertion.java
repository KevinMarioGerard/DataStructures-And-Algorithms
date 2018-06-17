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

  BST(){
    this.root = null;
  }

  BST(int key){
    this.root = new Node(key);
  }

  public static void main(String[] args){
    BST tree = new BST();
    tree.insert(50);
    tree.insert(30);
    tree.insert(70);
    tree.insert(60);
    tree.insert(20);
    tree.insert(80);
    tree.preorder(tree.root);
    System.out.println(tree.search(tree.root, 100));
  }

  public void insert(int key){
    this.root = insertNode(this.root, key);
  }

  public Node insertNode(Node node, int key){
    if(node == null){
      node = new Node(key);
      return node;
    }
    if(key <= node.key)
      node.left = insertNode(node.left, key);
    else if(key > node.key)
      node.right = insertNode(node.right, key);
    return node;
  }

  public void preorder(Node node){
    if(node == null)
      return;
    System.out.print(node.key + " ");
    preorder(node.left);
    preorder(node.right);
  }

  public boolean search(Node node, int key){
    if(node == null)
      return false;
    if(node.key == key)
      return true;
    return search(node.left, key) || search(node.right, key);
  }
}
