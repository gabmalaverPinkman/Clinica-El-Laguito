package co.edu.uptc.clinic.domain;

import co.edu.uptc.clinic.enums.IdentificationTypeEnum;

/**
 * Nombre de la clase: Doctor
 *
 * <p>Clase de modelo que representa la información de los médicos</p>
 *
 * @author gabma
 * @version 1.0
 * @since 6/05/2026
 */
public class Doctor {
	
	/**
	 * Atributo que determina el tipo de indentificación
	 */
	private IdentificationTypeEnum identificationType;
	
	/**
	 * Atributo que determina el id del medico
	 */
	private int medicalId;
	
	/**
	 * Atributo que determina el primer nombre del médico.
	 */
	private String firstName;
	
	/**
	 * Atributo que determina el apellido del médico.
	 */
	private String lastName;
	
	/**
	 * Atributo que determina la especialidal del médico 
	 */
	private String specialty;
	
	/**
	 * Atributo que determina los años de experiencia del médico
	 */
	private int yearsOfExperience;

	/**
	 * Crea una nueva instancia de Doctor.
	 *
	 * @param identificationType
	 * @param medicalId
	 * @param firstName
	 * @param lastName
	 * @param specialty
	 * @param yearsOfExperience Parámetro que determina
	 */
	public Doctor(IdentificationTypeEnum identificationType, int medicalId, String firstName, String lastName,
			String specialty, int yearsOfExperience) {
		super();
		this.identificationType = identificationType;
		this.medicalId = medicalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialty = specialty;
		this.yearsOfExperience = yearsOfExperience;
	}

	/**
	 * Método encargado de retornar el valor de identificationType.
	 *
	 * @return valor de identificationType
	 */
	public IdentificationTypeEnum getIdentificationType() {
		return identificationType;
	}

	/**
	 * Método encargado de establecer el valor de identificationType.
	 *
	 * @param identificationType nuevo valor de identificationType
	 */
	public void setIdentificationType(IdentificationTypeEnum identificationType) {
		this.identificationType = identificationType;
	}

	/**
	 * Método encargado de retornar el valor de medicalId.
	 *
	 * @return valor de medicalId
	 */
	public int getMedicalId() {
		return medicalId;
	}

	/**
	 * Método encargado de establecer el valor de medicalId.
	 *
	 * @param medicalId nuevo valor de medicalId
	 */
	public void setMedicalId(int medicalId) {
		this.medicalId = medicalId;
	}

	/**
	 * Método encargado de retornar el valor de firstName.
	 *
	 * @return valor de firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Método encargado de establecer el valor de firstName.
	 *
	 * @param firstName nuevo valor de firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Método encargado de retornar el valor de lastName.
	 *
	 * @return valor de lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Método encargado de establecer el valor de lastName.
	 *
	 * @param lastName nuevo valor de lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Método encargado de retornar el valor de specialty.
	 *
	 * @return valor de specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * Método encargado de establecer el valor de specialty.
	 *
	 * @param specialty nuevo valor de specialty
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	/**
	 * Método encargado de retornar el valor de yearsOfExperience.
	 *
	 * @return valor de yearsOfExperience
	 */
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	/**
	 * Método encargado de establecer el valor de yearsOfExperience.
	 *
	 * @param yearsOfExperience nuevo valor de yearsOfExperience
	 */
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	
	
}
