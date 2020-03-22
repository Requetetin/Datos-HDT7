/**
* @author Martin Amado 19020
* 
*
* Implementation de Tree para binary Tree
* Extraido de: https://www.baeldung.com/java-binary-tree
*/

import java.lang.*;
import java.util.*;

public class BinaryTree<E extends Comparable<E>> implements Tree<E>{

	Node root;

	private Node addValueRecursive(Node current, E valueOf){
		if(current == null){
			return new Node(valueOf);
		}

		E  aux = (E)current.valueOf;
		if(valueOf.compareTo(aux)<0){
			current.left = addValueRecursive(current.left, valueOf);
		}else if(valueOf.compareTo(aux)>0){
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

		if(valueOf == current.valueOf){
			return true;
		}
		E aux = (E)current.valueOf;
		if(valueOf.compareTo(aux)<0){
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



	ArrayList<E> back = new ArrayList<E>();
	public ArrayList<E> inOrder(Node node){

		if(node!= null){
			inOrder(node.left);
			
			back.add((E) node.valueOf);
			//System.out.println(" "+ node.valueOf.toString());
			inOrder(node.right);
		}
		return back;
	}

	public Node getRoot(){
		return root;
	}
}