package printLefViewOfBinaryTree;

public class Driver {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(12);
		tree.root.left = new Node(10);
		tree.root.right = new Node(30);
		tree.root.right.left = new Node(25);
		tree.root.right.right = new Node(40);

		tree.leftView();
	}

}
