package co.edu.uptc.clinic.repository;

import java.util.HashMap;
import java.util.HashSet;

import co.edu.uptc.clinic.domain.Patient;

public class PatientRepository {
	
	/**
	 * Atributo que determina el mapa de pacientes del sistema
	 */
	private HashMap<String, Patient> patients;
	
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
	public PatientRepository(HashMap<String, Patient> patients, HashSet<String> emails) {
		super();
		this.patients = patients;
		this.emails = emails;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de agregar un nuevo paciente <br>
	 * 
	 * @author gabma
	 *
	 * @param patient
	 * @return boolean
	 */
	public boolean addPatient(Patient patient) {
		patients.put(patient.getIdPatient(), patient);
		return true;
	}
	
	 /**
	 * <b>Descripción: </b> Método encargado de agragar un nuevo email al conjunto de emails<br>
	 * 
	 * @author gabma
	 *
	 * @param newEmail
	 * @return boolean
	 */
	public boolean addEmail(String newEmail) {
		 return emails.add(newEmail);
	 }
	
	

	/**
	 * Método encargado de retornar el valor de patients.
	 *
	 * @return valor de patients
	 */
	public HashMap<String, Patient> getPatients() {
		return patients;
	}

	/**
	 * Método encargado de establecer el valor de patients.
	 *
	 * @param patients nuevo valor de patients
	 */
	public void setPatients(HashMap<String, Patient> patients) {
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
