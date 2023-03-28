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
	/*Variable que almacena la ubicacion donde se encuentra el equipo*/
	public String ubicacionAula;
	
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

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @return the memoria
	 */
	public int getMemoria() {
		return memoria;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @param memoria the memoria to set
	 */
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	

}
