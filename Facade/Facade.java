
public class Facade {
	Juego juego =new Juego();
	Observer1 ob1= new Observer1();
	Observer2 ob2= new Observer2();
	JugadorControl control= new JugadorControl("entrada1.tex");
	Jugador jugador=null;
	Jugador player=null;
	
	/**
	 * Constructor por omision
	 */
	public Facade(){
	}
	
	/**
	 * Metodo que verifica que las contraseñas sean iguales
	 * @param String password ,String password2
	 * @return true en caso de que coincidan 
	 */
	public boolean contraseña(String password, String password2){
		if(!password.equals(password2)){
		System.out.println("Las contraseñas no coinciden");
		return false;
	}
	return true;
	}
	
	
	/**
	 * Metodo que crea al jugador y lo agrega al arreglo , guardando los 
	 * datos en el archivo
	 * @param String nombre, String usuario, String password,String password2
	 */
	public void agregarJugador(String nombre, String usuario, String password,String password2){
		if(contraseña(password,password2)==true){
	jugador= new Jugador( nombre, usuario, password);
				control.agregar(jugador);
				control.guardar();
				System.out.println("Jugador agregado");
			}
		}
		
		
	/**
	 * Metodo que verifica que el usuario coincida con la contraseña
	 * Lo va buscando en el arreglo
	 * @return true en caso que no coincidan
	 */
	public boolean accesoDenegado(String user, String pass){
			control.lectura();
				if(control.existeJugador(user,pass)==true){
				control.lectura();
				player=control.getJugador(user,pass);
				return false;
			}else
			System.out.println("Acceso denegado");
			System.out.println("Favor de revisar el usuario y/o contraseña");
			return true;
			}
			
			
				
	/**
	 * Metodo para iniciar una partida y aumentar el no. de ganadas
	 * o perdidas del jugador, segun corresponda
	 */
	public void jugar(){
	int resultado=juego.partida();
					 if(resultado==1){
						 ob1.actualizar(player);
						 control.guardar();
					 }else
						ob2.actualizar(player);
					 control.guardar();
				 }
			 
	/**
	 * Metodo que imprime las estadisticas
	 */
	public void estadisticas(){
	 player.printEstadisticas();
 }
 
 
	/**
	 * Metodo que reinicia las estadisticas, las deja en ceros
	 */
	public void borrar(){
		player.setGanadas(0);
		player.setPerdidas(0);
		control.guardar();
		player.printEstadisticas();
	}			
				 
	
			
	
				

} 
