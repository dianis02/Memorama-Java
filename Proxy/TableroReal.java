/**
 * Clase que crea un Tablero
 * Que implementa la interfaz TableroInterface
 * Se utilizan las clases ArrayList, Collections
 * @author Diana Ramirez
 */

import java.util.*;
public class TableroReal implements TableroInterface{

 String [][] tablero;
 
 /**
  * Constructor por omisión
  * Se llena el tablero con "?"
  */
	 public TableroReal(){
			tablero = new String [4] [4];
			for(int i=0;i<tablero.length; i++){	
			for(int j=0; j<tablero[i].length; j++){
			tablero [i][j] ="\t"+"?"+"\t"; 
		}
			}
				}
/**
 * Constructor por parametros
 * @param ArrayList array
 * Se revuelve el array con el metodo shuffle de Collections
 * y con este se va llenando el tablero
 */
	public TableroReal(ArrayList array){
		Collections.shuffle(array);
		int k=0;
		tablero = new String [4] [4];
			for(int i=0;i<tablero.length; i++){	
			for(int j=0; j<tablero[i].length; j++){
			tablero [i][j] ="\t"+array.get(k)+"\t";
			k+=1; 
		}
			}
				}
		
		
	/**
	 * Metodo que devuelve el tablero(matriz)
	 */
	public String [][] getTablero(){
		return tablero;
	}
		
 /**
 * Metodo que devuelve la representacion 
 * en cadena del tablero
 *  @return Representacion en cadena del tablero
 */     
    public String toString(){
      String acc = getLinea()+"\n";
      for(int i=0;i<tablero.length;i++){
        acc+="| ";
        for(int j=0;j<tablero[i].length;j++)
        acc += tablero[i][j]+" | ";
        acc +="\n"+getLinea()+"\n";
      }

      return acc;
    }
    
    
    private String getLinea(){
      return "-----------------------------------------------------------------";

    }
    
    
    }
