package co.edu.uptc.clinic.repository;

import java.util.HashMap;

import co.edu.uptc.clinic.domain.MedicalAppoinmet;

/**
 * Nombre de la clase: MedicalAppoinmetRespository
 *
 * <p>Maneja la información de las citas medicas que hay en el sistema</p>
 *
 * <p><b>Responsabilidades:</b></p>
 * <ul>
 *   <li>Añadir, verificar y devolver citas medicas</li>
 * </ul>
 * @author gabma
 * @version 1.0
 * @since 9/05/2026
 */
public class MedicalAppoinmetRespository {
	
	/**
	 * Atributo que determina el mapa de citas medicas.
	 */
	private HashMap<Integer, MedicalAppoinmet> medicalAppoinmets;

	/**
	 * Crea una nueva instancia de MedicalAppoinmetRespository.
	 *
	 * @param medicalAppoinmets Parámetro que determina
	 */
	public MedicalAppoinmetRespository(HashMap<Integer, MedicalAppoinmet> medicalAppoinmets) {
		super();
		this.medicalAppoinmets = medicalAppoinmets;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de añadir una nueva cita medica al mapa <br>
	 * 
	 * @author gabma
	 *
	 * @param medicalAppoinmet Recibe la cita a buscar
	 * @return
	 * @return boolean retorna true si se agregó la cita médica, si no se agregó retorna false
	 */
	public boolean addMedicalAppoinmet(MedicalAppoinmet medicalAppoinmet) {
		this.medicalAppoinmets.put(medicalAppoinmet.getIdMeducalAppoinmet(), medicalAppoinmet);
		return true;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de verificar si existe una cita médica según un id ingresado<br>
	 * 
	 * @author gabma
	 *
	 * @param key Recibe como llave el Id de la cita a buscar
	 * @return
	 * @return boolean retorna true si existe la cita médica, si no retorna false
	 */
	public boolean existById(Integer key) {
		return medicalAppoinmets.containsKey(key);
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de devolver una cita médica segun su id <br>
	 * 
	 * @author gabma
	 *
	 * @param key Recibe como llave el Id de la cita a buscar
	 * @return
	 * @return MedicalAppoinmet Retorna la cita médica encontrada, si no la encontró retorna null
	 */
	public MedicalAppoinmet findById(Integer key) {
		return medicalAppoinmets.get(key);
	}
	
	public HashMap<Integer, MedicalAppoinmet> findAll(){
		return this.medicalAppoinmets;
	}

	/**
	 * Método encargado de retornar el valor de medicalAppoinmets.
	 *
	 * @return valor de medicalAppoinmets
	 */
	public HashMap<Integer, MedicalAppoinmet> getMedicalAppoinmets() {
		return medicalAppoinmets;
	}

	/**
	 * Método encargado de establecer el valor de medicalAppoinmets.
	 *
	 * @param medicalAppoinmets nuevo valor de medicalAppoinmets
	 */
	public void setMedicalAppoinmets(HashMap<Integer, MedicalAppoinmet> medicalAppoinmets) {
		this.medicalAppoinmets = medicalAppoinmets;
	}

}
