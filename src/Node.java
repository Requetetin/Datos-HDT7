/**
* @author Martin Amado 19020
* 
*
* Nodo que nos indica siguiente posicion
* Extraido de: https://www.baeldung.com/java-binary-tree
*/

import java.lang.*;

public class Node<E extends Comparable<E>>{
	E valueOf;
	Node left;
	Node right;

	Node(E valueOf){
		this.valueOf = valueOf;
		right = null;
		left = null;
	}
}