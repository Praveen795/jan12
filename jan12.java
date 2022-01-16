package jan12;

import dec20.Node;

//implementation of tree and print inorder preorder and post order_____________________***

class Node{
int data;
Node left ,right;

public Node(int data) {
	
	this.data = data;
	this.left = null;
	this.right = null;
}


}

class Tree{


Node root;

public Tree() {
	
	this.root = null;
}

static void pre(Node node) {
	
	if(node==null) {
		return ;
		
	}else {
		System.out.println(node.data+"   ");
		pre(node.left);
		pre(node.right);
	}
	
}
static void inorder(Node node) {
	
	if(node==null) {
		return ;
	}else {
		inorder(node.left);
		System.out.println(node.data);
		inorder(node.right);
		
	}
}

static void post(Node node) {
	
	if(node==null) {
		return ;
		
	}else {
		post(node.left);
		post(node.right);
		System.out.println(node.data);
	}
}


}
public class jan12 {
	public static void main(String[] args) {
		
		
		
		Node root=new Node(1);
		 root.left=new Node(2);
		 root.right=new Node(3);
		 root.left.left=new Node(4);
		 root.left.right=new Node(5);
		 root.right.left=new Node(6);
		 root.right.right=new Node(7);
		 
		 System.out.println("pre order element");
		 
		 Tree.pre(root);
		 System.out.println("in order element");
		 Tree.inorder(root);
		 System.out.println("post order element");
		 Tree.post(root);
	}

}
