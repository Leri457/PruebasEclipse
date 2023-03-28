/**
 * 
 */
package ordenador_git;

/**
 * Esta es una clase para almacenar la información de los ordenadores del centro
 * @author ALUMNO
 * @version 1.0
 */
public class Ordenador {
	/*Se informa el modelo del ordenador*/
	public String modelo;
	/*Variable que almacena el precio del ordenador*/
	public double precio;
	/*Variable que almacena el tamaño de la memoria del ordenador*/
	public int memoria;
	
	/**
	 * Constructor vacio de la clase
	 */
	public Ordenador() {}
	
	/**
	 * Constructor de la clase al que se le pasan parámetros
	 * @param modelo: modelo del ordenador
	 * @param precio: precio del ordenador
	 * @param memoria: tamaño de la memoria del ordenador
	 */
	public Ordenador(String modelo, double precio, int memoria) {
		
		this.modelo=modelo;
		this.precio=precio;
		this.memoria=memoria;
		
	}

}
