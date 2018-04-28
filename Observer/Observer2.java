
public class Observer2 implements ObserverInterface{ 
	Jugador player;

	/**
	 * Constructor por omision
	 */
	public Observer2(){
	
	}
	
	/**
	 * Metodo que aumenta del numero de ganadas
	 * @param Jugador player
	 */
	public void actualizar(Jugador player){
		player.aumentarGanadas();
	}
	
	
}
