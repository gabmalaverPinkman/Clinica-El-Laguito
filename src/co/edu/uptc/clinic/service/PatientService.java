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
	 * <b>Descripción: </b> Método encargado de ... <br>
	 * 
	 * @author gabma
	 *
	 * @param patient
	 * @return
	 * @return boolean
	 * @throws Exception [Condición en la que ocurre]
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
	 * <b>Descripción: </b> Método encargado de ... <br>
	 * 
	 * @author gabma
	 *
	 * @param patient
	 * @return
	 * @return boolean
	 * @throws Exception [Condición en la que ocurre]
	 */
	public boolean addPatient(Patient patient) {
		if(validate(patient)) {
			return this.patientRepository.addPatient(patient);
		}
		
		return false;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de ... <br>
	 * 
	 * @author gabma
	 *
	 * @param id
	 * @return
	 * @return boolean
	 * @throws Exception [Condición en la que ocurre]
	 */
	public boolean existById(Integer id) {
		return this.patientRepository.existById(id);
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de ... <br>
	 * 
	 * @author gabma
	 *
	 * @param id
	 * @param medication
	 * @return
	 * @return boolean
	 * @throws Exception [Condición en la que ocurre]
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
	 * <b>Descripción: </b> Método encargado de ... <br>
	 * 
	 * @author gabma
	 *
	 * @param id
	 * @return
	 * @return Patient
	 * @throws Exception [Condición en la que ocurre]
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
