/**
* @author Martin Amado 19020
* 
*
* Implementation de Tree para binary Tree
* Extraido de: https://www.baeldung.com/java-binary-tree
*/

import java.lang.*;

public class BinaryTree<E extends Comparable<E>> implements Tree<E>{

	Node root;

	private Node addValueRecursive(Node current, E valueOf){
		if(current == null){
			return new Node(valueOf);
		}

		if(valueOf.compareTo(current.valueOf)<1){
			current.left = addValueRecursive(current.left, valueOf);
		}else if(valueOf.compareTo(current.valueOf)>1){
			current.right = addValueRecursive(current.right, valueOf);
		}else{
			return current;
		}

		return current;
	}

	public void addValue(E  valueOf){
		root = addValueRecursive(root, valueOf);
	}


	private boolean containsRecursive(Node current, E  valueOf){
		if(current == null){
			return false;
		}

		if(current == current.valueOf){
			return true;
		}
		if(valueOf.compareTo(current.valueOf)<1){
			return containsRecursive(current.left, valueOf);
		}
		else{
			return containsRecursive(current.right, valueOf);
		}
		/*return valueOf <current.valueOf
			?containsRecursive(current.left, valueOf);
			: containsRecursive(current.right, valueOf);*/
	}

	public boolean containsNode(E  valueOf){
		return containsRecursive(root, valueOf);
	}




	public void inOrder(Node node){
		if(node!= null){
			inOrder(node.left);
			System.out.println(" "+ node.valueOf);
			inOrder(node.right);
		}
	}
}