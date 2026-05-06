package co.edu.uptc.clinic.domain;

import java.util.LinkedHashSet;

import co.edu.uptc.clinic.enums.IdentificationTypeEnum;


/**
 * <b>Descripcion: </b> Clase modelo que representa la información del paciente <br>
 * @author gabma*
 */
public class Patient {
	
	/** Atributo que determina el tipo de identificación del paciente */
	private IdentificationTypeEnum identificationType;
	
	/** Atributo que determina el numero de identificación del paciente */
	private int idPatient;
	
	/** Atributo que determina el Nombre del paciente */
    private String firstName;
    
    /** Atributo que determina los Apellidos del paciente */
    private String lastName;
    
    /** Atributo que determina el Correo electrónico del paciente */
    private String email;

	
	/**
	 * Crea una nueva instancia de Patient.
	 *
	 * @param identificationType
	 * @param idPatient
	 * @param firstName
	 * @param lastName
	 * @param email Parámetro que determina
	 */
	public Patient(IdentificationTypeEnum identificationType, int idPatient, String firstName, String lastName,
			String email) {
		super();
		this.identificationType = identificationType;
		this.idPatient = idPatient;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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
	 * Método encargado de retornar el valor de idPatient.
	 *
	 * @return valor de idPatient
	 */
	public int getIdPatient() {
		return idPatient;
	}


	/**
	 * Método encargado de establecer el valor de idPatient.
	 *
	 * @param idPatient nuevo valor de idPatient
	 */
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
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
	 * Método encargado de retornar el valor de email.
	 *
	 * @return valor de email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * Método encargado de establecer el valor de email.
	 *
	 * @param email nuevo valor de email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
  
}
