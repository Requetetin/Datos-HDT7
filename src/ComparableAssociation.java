/**
* @author Martin Amado 19020
* 
*
* Clase association para guardar valores del diccionario
* Apoyo de: https://uvg.instructure.com/courses/13715/files/1118683?module_item_id=229209
*/


import java.lang.*;

public class ComparableAssociation<K extends Comparable<K>,V> implements Comparable<ComparableAssociation<K,V>>{

	K key;
	V value;



	public ComparableAssociation(K key, V value){
		this.key = key;
		this.value = value;
	}

	public ComparableAssociation(K key){
		this(key, null);
	}


	public int compareTo(ComparableAssociation<K,V> o){
		return key.compareTo(o.key);
	}

	

	public K getKey(){
		return this.key;
	}

	public V getValue(){
		return this.value;
	}




}