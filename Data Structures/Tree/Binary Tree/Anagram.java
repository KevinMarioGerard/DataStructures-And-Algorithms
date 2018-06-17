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

  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(1);
    bt.root.left = new Node(2);
    bt.root.right = new Node(3);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(5);
    bt.root.right.left = new Node(6);
    bt.root.right.right = new Node(7);
    bt.root.left.right.left = new Node(8);
    BinaryTree bt1 = new BinaryTree(1);
    bt1.root.left = new Node(2);
    bt1.root.right = new Node(3);
    bt1.root.left.left = new Node(4);
    bt1.root.left.right = new Node(8);
    bt1.root.right.left = new Node(6);
    bt1.root.right.right = new Node(7);
    bt1.root.left.right.left = new Node(5);
    System.out.println(bt.isAnagram(bt.root, bt1.root));

  }

  public boolean isAnagram(Node node1, Node node2){
    Queue<Node> q1 = new LinkedList<>();
    Queue<Node> q2 = new LinkedList<>();
    q1.add(node1);
    q2.add(node2);
    int level = 1;
    HashMap<Integer, Integer> hm = new HashMap<>();
    while(!q1.isEmpty()){
      int l = q1.size();
      while(l-- > 0){
        Node temp1 = q1.poll();
        if(temp1.left != null)
          q1.add(temp1.left);
        if(temp1.right != null)
          q1.add(temp1.right);
        if(hm.containsKey(temp1.key)){
          hm.put(temp1.key, hm.get(temp1.key) + 1 + level);
        }
        else
          hm.put(temp1.key, 1 + level);
      }
      level++;
    }
    level = 1;
    while(!q2.isEmpty()){
      int l = q2.size();
      while(l-- > 0){
        Node temp1 = q2.poll();
        if(temp1.left != null)
          q2.add(temp1.left);
        if(temp1.right != null)
          q2.add(temp1.right);
        if(hm.containsKey(temp1.key)){
          System.out.println(temp1.key);
          hm.put(temp1.key, hm.get(temp1.key) - 1 - level);
        }
        else
          hm.put(temp1.key, -1);
      }
      level++;
    }
    for(Map.Entry<Integer, Integer> m : hm.entrySet()){
      if(m.getValue() != 0){
        return false;
      }
    }
    return true;
  }
}
