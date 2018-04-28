import java.util.Scanner;

public class Juego{
	
	TableroProxy board =new TableroProxy();
	Scanner lector = new Scanner(System.in);
	int x1;
	int y1;
	int x2;
	int y2;
	
	public Juego(){
	}
	
	/**
	 * Metodo que inicia el juego
	 * @return 1 en caso de ganar o cero en caso de perder
	 */
    public int partida(){
	int puntuacion=0;
	int intentosFallidos=0;
	while(true){
	System.out.println("Instrucciones"+"\n"+ "Las coordenadas van del 0 al 3"+"\n");
	 
	 System.out.println(board.toString());
	
	System.out.println("Adivina el renglon:");
	x1= lector.nextInt();
	System.out.println("Adivina la columna:");
	y1 = lector.nextInt();
	
	System.out.println("Adivina el renglon:");
	x2 = lector.nextInt();
	System.out.println("Adivina la columna:");
	y2= lector.nextInt();
		
	
		//Verifica que no escojas la misma carta
		if(x1==x2 && y1==y2){
			System.out.println("Debes escoger 2 cartas diferentes");
		
	//Verifica el rango del tablero, que sea valido	
	}else if( x1<0 || 3<x1 || x2<0 || 3<x2 || y1<0 || 3<y1 || y2<0 || 3<y2){
		System.out.println("Oops, esta fuera del tablero.");
		continue;
	
		
		//Se voltean las cartas, si son iguales
		//se encontró un par
		}else if (board.voltearCarta(x1,y1)==board.voltearCarta(x2,y2)){
		  System.out.println("Encontraste un par!");  
		
		
		//Las cartas tienen diferente simbolo
		//Aumenta el numero de intentosFallidos
		//se muestran las cartas elegidas, pero luego se vuelven a voltear 
		}else
			System.out.println("No son iguales");
			board.fichasVolteadas(x1,y1,x2,y2);
			intentosFallidos+=1;
			
		//Se rompe el ciclo cuando se tienen 3 intentos fallidos'''
		if(intentosFallidos==3){
			System.out.println("Fin del Juego");
			break;
		}
			
		//Se rompe el ciclo en caso de hallar todos los pares
		if(board.Ganar()==true){
			puntuacion=1;
			System.out.println("Ganaste el Juego");
			break;
		}	
		
	
}
return puntuacion;


	
	
	
	
}
		
		
}
