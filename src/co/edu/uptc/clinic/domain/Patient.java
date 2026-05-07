package co.edu.uptc.clinic.domain;



import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import co.edu.uptc.clinic.enums.IdentificationTypeEnum;
import co.edu.uptc.clinic.enums.PriorityEnum;


/**
 * <b>Descripcion: </b> Clase modelo que representa la información del paciente <br>
 * @author gabma*
 */
public class Patient {
	
	/** Atributo que determina el tipo de identificación del paciente */
	private IdentificationTypeEnum identificationType;
	
	/** Atributo que determina el numero de identificación del paciente */
	private Integer idPatient;
	
	/** Atributo que determina el Nombre del paciente */
    private String firstName;
    
    /** Atributo que determina los Apellidos del paciente */
    private String lastName;
    
    /** Atributo que determina el Correo electrónico del paciente */
    private String email;
    
    /**
     * Atributo que determina el conjunto de medicamentos del paciente
     */
    private Set<String> medicationHistory;
    
    /**
     * Atributo que determina la prioridad de cada paciente
     */
    private PriorityEnum priority;

	
	/**
	 * Crea una nueva instancia de Patient.
	 *
	 * @param identificationType
	 * @param idPatient
	 * @param firstName
	 * @param lastName
	 * @param email Parámetro que determina
	 */
	public Patient(IdentificationTypeEnum identificationType, Integer idPatient, String firstName, String lastName,
			String email, LinkedHashSet<String> medicationsHistory, PriorityEnum priority) {
		super();
		this.identificationType = identificationType;
		this.idPatient = idPatient;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.medicationHistory = new LinkedHashSet<String>();
		this.priority = priority;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.idPatient, this.identificationType);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) { 
		Patient auxPatient = (Patient) obj;
		return this.idPatient.equals(auxPatient.getIdPatient()) && this.identificationType == auxPatient.getIdentificationType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Patient [identificationType=" + identificationType + ", idPatient=" + idPatient + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", medicationHistory=" + medicationHistory
				+ ", priority=" + priority + "]";
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
	public Integer getIdPatient() {
		return idPatient;
	}


	/**
	 * Método encargado de establecer el valor de idPatient.
	 *
	 * @param idPatient nuevo valor de idPatient
	 */
	public void setIdPatient(Integer idPatient) {
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

	/**
	 * Método encargado de retornar el valor de medicationHistory.
	 *
	 * @return valor de medicationHistory
	 */
	public Set<String> getMedicationHistory() {
		return medicationHistory;
	}

	/**
	 * Método encargado de establecer el valor de medicationHistory.
	 *
	 * @param medicationHistory nuevo valor de medicationHistory
	 */
	public void setMedicationHistory(Set<String> medicationHistory) {
		this.medicationHistory = medicationHistory;
	}

	/**
	 * Método encargado de retornar el valor de priority.
	 *
	 * @return valor de priority
	 */
	public PriorityEnum getPriority() {
		return priority;
	}

	/**
	 * Método encargado de establecer el valor de priority.
	 *
	 * @param priority nuevo valor de priority
	 */
	public void setPriority(PriorityEnum priority) {
		this.priority = priority;
	}
}
