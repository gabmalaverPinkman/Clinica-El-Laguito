package co.edu.uptc.clinic.repository;

import java.util.HashMap;
import java.util.HashSet;

import co.edu.uptc.clinic.domain.Doctor;
import co.edu.uptc.clinic.domain.Patient;

/**
 * Nombre de la clase: PatientRepository
 *
 * <p>Clase que gestiona el almacenamiento de la información de cada paciente</p>
 *
 * <p><b>Responsabilidades:</b></p>
 * <ul>
 *   <li>Modificar el almacenamiento y los datos de cada paciente</li>
 * </ul>
 *
 *
 * @author gabma
 * @version 1.0
 * @since 6/05/2026
 */
public class PatientRepository {
	
	/**
	 * Atributo que determina el mapa de pacientes del sistema
	 */
	private HashMap<Integer, Patient> patients;
	
	/**
	 * Atributo que determina el conjunto de emails registrados en el sistema
	 */
	private HashSet<String> emails;

	/**
	 * Crea una nueva instancia de PatientRepository.
	 *
	 * @param patients
	 * @param emails Parámetro que determina
	 */
	public PatientRepository(HashMap<Integer, Patient> patients, HashSet<String> emails) {
		super();
		this.patients = patients;
		this.emails = emails;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de agregar un nuevo paciente y un nuevo email al sistema<br>
	 * 
	 * @author gabma
	 *
	 * @param patient Recibe un objeto de tipo Patient
	 * @return boolean Retorna verdadero si se agregó el email y el paciente, o falso si no se agregaron.
	 */
	public boolean addPatient(Patient patient) {
		emails.add(patient.getEmail()); 
	    patients.put(patient.getIdPatient(), patient); 
	    return true;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de veridficar si un paciente existe segun su id <br>
	 * 
	 * @author gabma
	 *
	 * @param id
	 * @return boolean
	 */
	public boolean existById(Integer id) {
		return patients.containsKey(id);
	}
	
	
	/**
	 * <b>Descripción: </b> Método encargado de Añadir el medicamento al conjunto de 
	 * medicamentos del paciente. <br>
	 * 
	 * @author gabma
	 *
	 * @param idPatient
	 * @param medication
	 * 
	 * @return boolean
	 */
	public boolean addMedication(Integer idPatient, String medication) {
		Patient patient = findById(idPatient);
		if (patient == null) {
			return false;
		}
		return patient.getMedicationHistory().add(medication);
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de buscar y devolver el paciente
	 * encontrado por su id <br>
	 * 
	 * @author gabma
	 *
	 * @param idPatient
	 * @return
	 * @return Patient
	 * @throws Exception [Condición en la que ocurre]
	 */
	public Patient findById(Integer idPatient) {
		return patients.get(idPatient);
	}


	/**
	 * Método encargado de retornar el valor de patients.
	 *
	 * @return valor de patients
	 */
	public HashMap<Integer, Patient> getPatients() {
		return patients;
	}

	/**
	 * Método encargado de establecer el valor de patients.
	 *
	 * @param patients nuevo valor de patients
	 */
	public void setPatients(HashMap<Integer, Patient> patients) {
		this.patients = patients;
	}

	/**
	 * Método encargado de retornar el valor de emails.
	 *
	 * @return valor de emails
	 */
	public HashSet<String> getEmails() {
		return emails;
	}

	/**
	 * Método encargado de establecer el valor de emails.
	 *
	 * @param emails nuevo valor de emails
	 */
	public void setEmails(HashSet<String> emails) {
		this.emails = emails;
	}
}
