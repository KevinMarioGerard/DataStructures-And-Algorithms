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
  int count[] = new int[20];
  BinaryTree(int key){
    this.root = new Node(key);
  }
  public int levelOrder(Node node){
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    q.add(new Node(-1));
    int max = 0;
    int height = 0;
    while(!q.isEmpty()){
      Node temp = q.poll();
      if(temp.key == -1){
        max = max > height ? max : height;
        height = 0;
        if(q.isEmpty())
          break;
        q.add(new Node(-1));
        continue;
      }
      if(temp.left != null)
        q.add(temp.left);
      if(temp.right != null)
        q.add(temp.right);
      height++;
    }
    return max;
  }
  public void preorder(Node node, int level){
    if(node == null){
      return;
    }
    count[level]++;
    preorder(node.left, level + 1);
    preorder(node.right, level + 1);
  }
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.root.left.left.right = new Node(8);
    System.out.println(bt.levelOrder(bt.root));
    bt.preorder(bt.root, 0);
    int max = 0;
    System.out.println(Arrays.toString(bt.count));
    for(int i = 0; i < bt.count.length; i++){
      if(max < bt.count[i])
        max = bt.count[i];
    }
    System.out.println(max);
  }
}
