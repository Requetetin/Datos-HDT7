/**
* @author Martin Amado 19020
* 
*
* Encargada de recibir lo ingresado por el usuario
*/
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		BinaryTree<ComparableAssociation<String,String>> tree = new BinaryTree<ComparableAssociation<String,String>>();
		ComparableAssociation<String, String> temp;
		

		try{
			String line = "";
			Scanner reader = new Scanner(new File("diccionario.txt"));	
			while(reader.hasNextLine()){
				line = reader.nextLine();
				String[] parts = line.split(", "); 	

				tree.addValue(temp= new ComparableAssociation<String,String>(parts[0], parts[1]));
				

			}
		}catch(Exception e){
			System.out.println("El archivo 'diccionario.txt' no ha sido encontrado");
		}

		ArrayList<ComparableAssociation<String,String>> ordered =  tree.inOrder(tree.getRoot());

		for(int i=0; i<ordered.size(); i++){
			System.out.println(ordered.get(i).getKey()+", "+ordered.get(i).getValue());
		}
		

	}
}