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
			//A partir de aqui se ingresan los datos del archivo al arbol
			String line = "";
			Scanner reader = new Scanner(new File("diccionario.txt"));	
			while(reader.hasNextLine()){
				line = reader.nextLine();
				String[] parts = line.split(", "); 	

				tree.addValue(temp= new ComparableAssociation<String,String>(parts[0].replace("(",""), parts[1].replace(")","")));
				

			}

			//Se realiza el recorrido inOrder del arbol
			ArrayList<ComparableAssociation<String,String>> ordered =  tree.inOrder(tree.getRoot());
			System.out.println("A continuacion se mostrara el arbol en inOrder:\n\n");
			for(int i=0; i<ordered.size(); i++){
				System.out.println("("+ordered.get(i).getKey()+", "+ordered.get(i).getValue()+")");
			}
			System.out.println("\n\n");


			try{
				String translation = "";
				Scanner translator = new Scanner(new File("traduccion.txt"));
				String pretrans = translator.nextLine();
				String[] wBw = pretrans.split(" ");

				System.out.println("La traduccion es la siguiente\n\n");
				System.out.println(pretrans+" -->");

				ArrayList<String> temporal = new ArrayList<String>();
				for(int i=0; i<wBw.length;i++){
					temporal.add(wBw[i]);
					for(int j=0;j<ordered.size();j++){
						if(wBw[i].equalsIgnoreCase(ordered.get(j).getKey())){
							temporal.set(i, "*"+ordered.get(j).getValue()+"*");

						}
					}
					
				}
				for(int i=0; i< temporal.size();i++){
					translation += temporal.get(i)+" ";
				}
				System.out.println(translation+"\n\n");
			}catch(Exception e){
				System.out.println("El archivo a traducir no existe");
			}


		}catch(Exception e){
			System.out.println("El archivo 'diccionario.txt' no ha sido encontrado");
		}

		
		

	}
}