package co.edu.uptc.clinic.service;

import co.edu.uptc.clinic.domain.Patient;
import co.edu.uptc.clinic.repository.PatientRepository;

public class PatientService {

	private PatientRepository patientRepository;

	/**
	 * Crea una nueva instancia de PatientService.
	 *
	 */
	public PatientService(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de validar los atributos de el nuevo paciente <br>
	 * 
	 * @author gabma
	 *
	 * @param patient
	 * @return
	 * @return boolean Retorna true si cumple con los requisistos de ser añadido o false si incumple algunos de ellos
	 */
	public boolean validate(Patient patient) {
		if(patient.getIdPatient() == null || patient.getIdPatient() <= 0) {
			return false;
		}
		if(patient.getFirstName() == null || patient.getFirstName().isBlank()) {
			return false;
		}
		if(patient.getLastName() == null || patient.getLastName().isBlank()) {
			return false;
		}
		if(patient.getEmail() == null || patient.getEmail().isBlank()) {
			return false;
		}
		if(this.patientRepository.existById(patient.getIdPatient())) {
			return false;
		}
		return true;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de agregar un paxciente al sistema <br>
	 * 
	 * @author gabma
	 *
	 * @param patient recibe el paciente nuevo a agregar al sistema
	 * @return
	 * @return boolean Retorna true si se agregó correctamente al sistema o false si no
	 */
	public boolean addPatient(Patient patient) {
		if(validate(patient)) {
			return this.patientRepository.addPatient(patient);
		}
		
		return false;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de verificar si un paciente existe segun su id <br>
	 * 
	 * @author gabma
	 *
	 * @param id Recibe el id del paciente a buscar
	 * @return
	 * @return boolean retorna True si el paciente existe o false si no
	 */
	public boolean existById(Integer id) {
		return this.patientRepository.existById(id);
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de añadir un nuevo medicamento al registro de cada paciente<br>
	 * 
	 * @author gabma
	 *
	 * @param id recibe el id del paciente dueño del nuevo medicamento
	 * @param medication recibe el nuevo medicamento
	 * @return
	 * @return boolean Retorna true si fue posible añadir el nuevo medicamento
	 */
	public boolean addMedication(Integer id, String medication) {
		if(id == 0 || id <= 0) {
			return false;
		}
		if(medication == null || medication.isBlank()) {
			return false;
		}
		return patientRepository.addMedication(id, medication);
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de devolver un oaciento segun su id <br>
	 * 
	 * @author gabma
	 *
	 * @param id Recibe el id del paciente que tiene que devolver
	 * @return
	 * @return Patient Retorna el paciente solicitado
	 */
	public Patient findById(Integer id) {
		return this.patientRepository.findById(id);
	}

	/**
	 * Método encargado de retornar el valor de patientRepository.
	 *
	 * @return valor de patientRepository
	 */
	public PatientRepository getPatientRepository() {
		return this.patientRepository;
	}

	/**
	 * Método encargado de establecer el valor de patientRepository.
	 *
	 * @param patientRepository nuevo valor de patientRepository
	 */
	public void setPatientRepository(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}
	
	
}
