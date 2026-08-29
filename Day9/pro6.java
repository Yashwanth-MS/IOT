package day9;

public class pro6 {
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	static Node findCA(Node root, int n1, int n2) {
		if (n1 < root.data && n2 < root.data) {
			return findCA(root.left, n1, n2);
		}
		if (n1 > root.data && n2 > root.data) {
			return findCA(root.right, n1, n2);
		}
		return root;
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(2);
		root.left.right = new Node(7);
		int n1 = 2;
		int n2 = 7;

		Node result = findCA(root, n1, n2);

		System.out.println("LCA = " + result.data);
	}

}
