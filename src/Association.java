/**
* @author Martin Amado 19020
* 
*
* Clase association para guardar valores del diccionario
* Apoyo de: https://uvg.instructure.com/courses/13715/files/1118683?module_item_id=229209
*/


import java.lang.*;

public class ComparableAssociation<K extends Comparable<K>,V>{

	K key;
	V value;

	ComparableAssociation(K key, V value){
		this.key = key;
		this.value = value;
	}

	ComparableAssociation(K key){
		this(key, null);
	}




}