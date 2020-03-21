/**
* @author Martin Amado 19020
* 
*
* Interfaz tree
*/

import java.lang.*;

interface Tree<E>{

	/*
	*
	* pre:
	* post: Tree has new element
	* @param: valueOf
	* Adds a value to the tree 
	*
	*/
	public void addValue(E valueOf);

	/*
	*
	* pre: Tree is not empty
	* post: 
	* @param: valueOf
	* Find value of a tree
	*
	*/
	public boolean containsNode(E  valueOf);

	
}	