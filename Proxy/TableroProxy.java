import java.util.*;
public class TableroProxy implements TableroInterface {
	ArrayList<String> array = new ArrayList<String>(Arrays.asList("<3","<3",":)",":)",":(",":(","$","$","@","@",":D",":D",":3",":3","</3","</3"));
	TableroReal tableroUsuario= new TableroReal();
	TableroReal tableroFichas= new TableroReal(array);
	
	public TableroProxy(){
	}
	
	/**
	 * Metodo que devuelve el estado actual del tableroUsuario
	 */
	public String [][] getEstado(){
		return tableroUsuario.getTablero();
	}
	
	
	/**
	 * Metodo para ver el valor de la ficha 
	 * @param int x--->coordenada x, int y--->coordenada y
	 * Se utilizan 2 tableros, uno con "?" y otro con los valores
	 * el primer tablero toma los valores 
	 * del segundo de la coordenadas dadas
	 */
	public String voltearCarta(int x, int y){
		String [][] tU=tableroUsuario.getTablero();
		String [][] tF=tableroFichas.getTablero();
		tU[x][y]=tF[x][y];
		System.out.println(tableroUsuario.toString());
		return tU[x][y];
		}
		
	
		
	/**
	 * Metodo para regresar el tablero de tableroUsuario a su estado
	 * original con "?"
	 * @param int x--->coordenada x, int y--->coordenada y del primer elem
	 * @param int x--->coordenada x, int y--->coordenada y del segundo elem
	 */	
	public void fichasVolteadas(int x1, int y1, int x2, int y2){
		String [][] tU=tableroUsuario.getTablero();
		String [][] tF=tableroFichas.getTablero();
		tU[x1][y1]="\t"+"?"+"\t";
		tU[x2][y2]="\t"+"?"+"\t";

	}
	
	/**
	 * Metodo que verifica si ambos tableros son iguales
	 * @return boolean, true en caso que sean iguales
	 */
	public boolean Ganar(){
		if(tableroUsuario.equals(tableroFichas)){
			return true;
		}else
			return false;
			
			}
			
	/**
	 * Metodo que regresa la representacion del tablero
	 * @return la representacion del tablero en la terminal
	 */
	 public String toString(){
		 return tableroUsuario.toString();
	 }
		
	
	
}
		
