
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    void countPaths(Node root)
    {
	    Queue<Node> q = new LinkedList<>();
	    q.add(root);
	    int path = 1;
	    while(!q.isEmpty()){
	        int l = q.size();
	        int count = 0;
	        while(l-- > 0){
	            Node temp = q.poll();
	            if(temp.left == null && temp.right == null)
	                count++;
	            if(temp.left != null)
	                q.add(temp.left);
	            if(temp.right != null)
	                q.add(temp.right);
	        }
	        if(count != 0)
	            System.out.print(path + " " + count + " $");
	        path++;
	    }
    }
}
