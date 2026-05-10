package co.edu.uptc.clinic.service;

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
	 * Método encargado de retornar el valor de patientRepository.
	 *
	 * @return valor de patientRepository
	 */
	public PatientRepository getPatientRepository() {
		return patientRepository;
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
