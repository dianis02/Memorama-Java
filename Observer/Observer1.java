
public class Observer1 implements ObserverInterface{
	Jugador player;

	/**
	 * Constructor por omision
	 */
	public Observer1(){
		
	}
	
	/**
	 * Metodo que aumenta el numero de perdidas del jugador
	 * @param Jugador player 
	 */
	public void actualizar(Jugador player){
		player.aumentarPerdidas();
	}
}


