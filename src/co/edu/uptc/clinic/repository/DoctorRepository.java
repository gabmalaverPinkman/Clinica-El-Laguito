

package co.edu.uptc.clinic.repository;

import java.util.HashMap;

import co.edu.uptc.clinic.domain.Doctor;

/**
 * Nombre de la clase: DoctorRepository
 *
 * <p>Clase responsable de la gestión de la informacion y almacenamiento de la informacón de cada doctor</p>
 *
 * <p><b>Responsabilidades:</b></p>
 * <ul>
 *   <li>Gestionar almacenamiento e información de cada doctor</li>
 *
 * @author gabma
 * @version 1.0
 * @since 6/05/2026
 */
public class DoctorRepository {
	
	/**
	 * Atributo que determina el mapa de los medicos registrados
	 */
	private HashMap<Integer, Doctor> doctors;

	
	/**
	 * Crea una nueva instancia de DoctorRepository.
	 *
	 * @param doctors Parámetro que determina el mapa de doctores.
	 */
	public DoctorRepository(HashMap<Integer, Doctor> doctors) {
		super();
		this.doctors = doctors;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de añadir un nuevo doctor al mapa de doctores. <br>
	 * 
	 * @author gabma
	 *
	 * @param newDoctor Recibe el doctor a agregar al sistema
	 * @return boolean Retorona true si se agregó o false si no.
	 */
	public boolean addDoctor(Doctor newDoctor) {
		this.doctors.put(newDoctor.getMedicalId(), newDoctor);
		return true;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de verificar si existe un doctor en el sistema <br>
	 * 
	 * @author gabma
	 *
	 * @param key Recibe el id del doctor a buscar
	 * @return boolean Retorna true si el doctor que recibe el metodo existe, y retorna false si no existe.
	 */
	public boolean existById(Integer key) {
		return doctors.containsKey(key);
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de buscar y devolver un doctor según su id <br>
	 * 
	 * @author gabma
	 *
	 * @param key encargado de recibir el Id del doctor a buscar
	 * @return Doctor Retorna el doctor buscado
	 */
	public Doctor findById(Integer key) {
		return this.doctors.get(key);
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de  devolver todos los doctores del sistema <br>
	 * 
	 * @author gabma
	 *
	 * @return
	 * @return HashMap<Integer,Doctor> devuelve un mapa lista de doctores
	 * @throws Exception [Condición en la que ocurre]
	 */
	public HashMap<Integer, Doctor> findAll(){
		return this.doctors;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de retornar el valor de doctors<br>
	 * 
	 * @author gabma
	 *
	 * @return
	 * @return HashMap<Integer,Doctor>
	 */
	public HashMap<Integer, Doctor> getDoctors() {
		return doctors;
	}

	/**
	 * Método encargado de establecer el valor de doctors.
	 *
	 * @param doctors nuevo valor de doctors
	 */
	public void setDoctors(HashMap<Integer, Doctor> doctors) {
		this.doctors = doctors;
	}
	
	
	

}
