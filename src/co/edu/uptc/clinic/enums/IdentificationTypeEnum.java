package co.edu.uptc.clinic.enums;

/**
 * Nombre de la clase: IdentificationTypeEnum
 *
 * <p>Establecer el tipo de documento del paciente</p>
 *
 *
 * @author gabma
 * @version 1.0
 * @since 5/05/2026
 */
public enum IdentificationTypeEnum {
	
	/** Cédula de ciudadanía*/
    CC("Cédula de ciudadanía"),
    
    /** Tarjeta de identidad*/
    TI("Tarjeta de identidad"),
    
    /** Cédula de extranjería*/
    CE("Cédula de extranjería"),
    
    /** Pasaporte*/
    PA("Pasaporte");
	
	/** Atributo que determina el nombre del tipo de identificación*/
	private final String officialName;
	
	
	/**
	 * Crea una nueva instancia de IdentificationTypeEnum.
	 *
	 * @param officialName Parámetro que determina el nombre oficial del tipo de identificación
	 */
	private IdentificationTypeEnum(String officialName) {
		this.officialName = officialName;
	}
	/**
     * <b>Descripción: </b> Retorna el nombre oficial del tipo de identificación <br>
     * @return officialName Nombre oficial del tipo de identificación
     */
	public String getOfficialName() {
		return officialName;
	}

}