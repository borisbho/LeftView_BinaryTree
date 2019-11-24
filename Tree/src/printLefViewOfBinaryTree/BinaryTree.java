package printLefViewOfBinaryTree;

//The left view contains all nodes that are first nodes in their levels.

//A simple solution is to do level order traversal and print the first node in every level.
//
//The problem can also be solved using simple recursive traversal.
//We can keep track of the level of a node by passing a parameter to all recursive calls.
//The idea is to keep track of the maximum level also.Whenever we see a node whose level is more than maximum level so far,
//we print the node because this is the first node in its level(Note that we traverse the left subtree before right subtree).

//Java program to print left view of binary tree 
class Node {
	int data;
	Node left;
	Node right;

	public Node(int item) {
		data = item;
		left = right;
		right = null;
	}
}

public class BinaryTree {
	
	Node root;
	int max_level = 0;
	
	//Recursive function to print left view
	public void leftViewUtil(Node node, int level) {
		
		//Base Case
		if(node == null) {
			return;
		}
		
		//if this is the first node of its level
		if(max_level < level) {
			System.out.println(" " + node.data);
			max_level = level;
		}
		
		//Recur for left and right subtrees
		leftViewUtil(node.left, level + 1);
		leftViewUtil(node.right, level + 1);
	}
	
	//A wrapper over lefViewUtil()
	public void leftView() {
		leftViewUtil(root,1);
	}
}
