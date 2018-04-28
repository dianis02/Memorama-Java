import java.io.Serializable;

public class Jugador implements Serializable{
	private String nombre;
	private String usuario;
	private String password;
	private int ganadas;
	private int perdidas;


/**
 * Constructor por parametros
 * @param String name, String username, String password
 * 
 */ 
	public Jugador(String nombre, String usuario, String password){
		this.nombre = nombre;
		this.usuario = usuario;
      	this.password = password;
      	ganadas=0;
      	perdidas=0;
	}

/**
 * Metodo que regresa el atributo nombre
 * @return nombre
 */
	public String getNombre(){
		return nombre;
	}
/**
 * Metodo que cambia el atributo nombre
 * @param string nombre
 */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	
	
	
/**
 * Metodo que cambia el atributo ganadas
 * @param int ganadas
 */
	public void setGanadas(int g){
		ganadas = g;
	}
	
	
	
	/**
 * Metodo que cambia el atributo perdidas
 * @param int perdidas
 */
	public void setPerdidas(int p){
		perdidas= p;
	}
	


/**
 * Metodo que regresa el atributo usuario
 * @return usuario
 */
	public String getUsuario(){
		return usuario;
	}
	
	
/**
 * Metodo que cambia el atributo password
 * @param string usuario
 */

	public void setUsuario(String usuario){
		this.usuario = usuario;
	}

/**
 * Metodo que regresa el atributo password
 * @return password
 */
	public String getPassword(){
		return password;
	}


/**
 * Metodo que cambia el atributo password
 * @param string password
 */
	public void setPassword(String password){
		this.password = password;
	}
	
/**
 * Metodo para aumentar el numero de victorias
 */
	public void aumentarGanadas(){
		ganadas+=1;
	}
	
	
	
/**
 * Metodo para aumentar el numero de perdidas
 */
	public void aumentarPerdidas(){
		perdidas+=1;
	}
	
	
	
	/**
 * Metodo que regresa el atributo ganadas
 * @return ganadas
 */
	public int getGanadas(){
		return ganadas;
	}
	
	
	
	/**
 * Metodo que regresa el atributo perdidas
 * @return perdidas
 */
	public int getPerdidas(){
		return perdidas;
	}


	
	
	/**
	 * Metodo que imprime las estadisticas del jugador
	 */ 
	public void printEstadisticas(){
		 System.out.println("Partidas ganadas: "+getGanadas());
		System.out.println( "Partidas perdidas:"+getPerdidas());
		int total=getGanadas()+getPerdidas();
		 System.out.println("No. de partidas;"+total);
	
}
}
