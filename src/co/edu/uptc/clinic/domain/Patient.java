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

	
	public Patient(IdentificationTypeEnum identificationType, int idPatient, String firstName, String lastName,
			String email) {
		super();
		this.identificationType = identificationType;
		this.idPatient = idPatient;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
    
    
    
  
}
