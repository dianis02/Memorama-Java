import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.NotSerializableException;
import java.lang.ClassNotFoundException;
import java.util.ArrayList;


public class JugadorControl implements Serializable{

	private String file_name;
	private ArrayList<Jugador> list_jugadores = new ArrayList<Jugador>();

	/**
	 * Constructor por parametros
	 * @param String , nombre del archivo
	 */
	public JugadorControl(String file_name){
		this.file_name = file_name;
	}

	/**
	 * Metodo para realizar la lectura del archivo
	 */
	@SuppressWarnings("unchecked")
	public void lectura(){
		try{
			ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file_name));
			list_jugadores= (ArrayList<Jugador>) reader.readObject();
			reader.close();
		}catch(IOException | ClassNotFoundException e){
			System.out.println("Error al importar información.");
		}
	}

	/**
	 * Metodo de escritura del archivo
	 */
	public void guardar(){
		try{
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file_name));
			writer.writeObject(list_jugadores);
			writer.close();
		}catch(IOException e){
			System.out.println("Error al exportar información \n" + e);
		}
	}

	/**
	 * Metodo que verifica que existe en el arreglo el jugador inidicado
	 * @param String username, String password
	 */
	public boolean existeJugador(String username, String password){
		for (int i = 0; i < list_jugadores.size(); i++){
			String tmp_username = list_jugadores.get(i).getUsuario();
			String tmp_password = list_jugadores.get(i).getPassword();
			if(username.equals(tmp_username) && password.equals(tmp_password))
				return true;
		}
		return false;
	}
	
	/**
	 * Metodo para obtener el jugador solicitado
	 * @param String username, String password
	 * @return Jugador
	 */
	public Jugador getJugador(String username, String password){
		for (int i = 0; i < list_jugadores.size(); i++){
			String tmp_username = list_jugadores.get(i).getUsuario();
			String tmp_password = list_jugadores.get(i).getPassword();
			if(username.equals(tmp_username) && password.equals(tmp_password))
				return list_jugadores.get(i);
		}
		return null;
	}
	
	/**
	 * Agrega al arreglo a un jugador ya creado
	 */
	public void agregar(Jugador player){
		list_jugadores.add(player);
	}

	/**
	 * Metodo que crea un jugador y luego lo agrega al arreglo
	 * @param String nombre, String username, String password
	 */
	public void crear_agregar(String name, String username, String password){
		list_jugadores.add(new Jugador(name,username,password));
	}

	/**
	 * Metodo que elimina a un jugador del arreglo
	 * @param Jugador player
	 * @return true en caso de eliminarlo
	 */
	public boolean eliminar(Jugador player){
		return list_jugadores.remove(player);
	}
	

	
}
