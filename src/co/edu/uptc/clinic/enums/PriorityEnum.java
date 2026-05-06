package co.edu.uptc.clinic.enums;

/**
 * Nombre de la clase: PriorityEnum
 *
 * <p>Establcer la prioridad de cada paciente.</p>
 
 *
 * @author gabma
 * @version 1.0
 * @since 5/05/2026
 */
public enum PriorityEnum {
	
	
	/**Baja*/
	LOW (0),
	
	/**Media*/
	MEDIUM (1),
	
	/**Alta*/ 
	HIGH (2),
	
	/**Critica*/
	CRITICAL(3);
	
	/**
	 * Atributo que determina el valor de cada Prioridad
	 */
	private final int oficialValue;

	/**
	 * Crea una nueva instancia de PriorityEnum.
	 *
	 * @param oficialValue Parámetro que determina el valor de la prioridad
	 */
	private PriorityEnum(int oficialValue) {
		this.oficialValue = oficialValue;
	}

	/**
	 * Método encargado de retornar el valor de oficialValue.
	 *
	 * @return valor de oficialValue
	 */
	public int getOficialValue() {
		return oficialValue;
	}
	
	
	
	
	
	
	
}
