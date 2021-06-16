package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {

	Node root;
	public class Node
	{
		int data;
		Node right,left;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public void create()
	{
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		Node eight = new Node(8);
		Node nine = new Node(9);
		Node ten = new Node(10);

		
		root = first;
		first.left  = second;
		first.right = third;
		second.left = forth;
		second.right = fifth;
//		third.left = six;
//		third.right = seven;
//		forth.left = eight;
//		forth.right = nine;
//		fifth.left = ten;
		
	}
	
	 int maxDepth(Node node)  
	    { 
	        if (node == null) 
	            return -1; 
	        else 
	        { 
	            int lDepth = maxDepth(node.left); 
	            int rDepth = maxDepth(node.right); 
	            return Math.max(lDepth,rDepth)+1; 
	        } 
	    }
	
	public void preOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void preOrderI(Node root)
	{
		if(root == null)
		{
			return;
		}
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty())//!stack.isEmpty()
		{
			Node temp = stack.pop();
			System.out.print(temp.data+" ");
			
			if(temp.right != null)
			{
				stack.push(temp.right);
			}
			if(temp.left != null)
			{
				stack.push(temp.left);
			}
		}
	}
	
	public void inOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);

	}
	
	
	public void inOrderI(Node node)
	{
		if(root==null)
		{
			return;
		}
		
		Stack<Node> stack = new Stack<>();
		Node temp = root;
		while(!stack.isEmpty() || temp != null)
		{
			if(temp!=null)
			{
				stack.push(temp);
				temp= temp.left;
			}else {
				temp = stack.pop();
				System.out.println(temp.data+" ");
				temp = temp.right;
			}
		}
		
	
	}
	
	public void postOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");

	}
	
	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.create();
		Node root = tree.root;
		//System.out.println(tree.maxDepth(root));
		//tree.preOrderI(root);
		tree.inOrderI(root);
//		tree.preOrder(root);
//		System.out.println();
//		System.out.println("In Order");
//		tree.inOrder(root);
//		System.out.println();
//		System.out.println("Post Order");
//		tree.postOrder(root);
//	
		}
}
