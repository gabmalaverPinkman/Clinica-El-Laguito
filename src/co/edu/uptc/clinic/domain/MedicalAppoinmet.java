package co.edu.uptc.clinic.domain;

import java.time.LocalTime;
import java.util.Objects;

/**
 * Nombre de la clase: MedicalAppoinmet
 *
 * <p>Clase modelo que representa la información de cada cita médica</p>
 *
 * <p><b>Responsabilidades:</b></p>
 * <ul>
 *   <li>representar la información de cada cita médica</li>
 *
 * @author gabma
 * @version 1.0
 * @since 6/05/2026
 */
public class MedicalAppoinmet {
	
	/**
	 * Atributo que determina el identificador de la cita médica
	 */
	private Integer idMeducalAppoinmet;
	
	/**
	 * Atributo que determina la hora de la cita médica
	 */
	private LocalTime timeAppoinmet;
	
	/**
	 * Atributo que determina la información del paciente
	 */
	private Patient patient;
	
	/**
	 * Atributo que determina la información del doctor
	 */
	private Doctor doctor;

	/**
	 * Crea una nueva instancia de MedicalAppoinmet.
	 *
	 * @param idMeducalAppoinmet
	 * @param timeAppoinmet
	 * @param patient
	 * @param doctor Parámetro que determina
	 */
	public MedicalAppoinmet(Integer idMeducalAppoinmet, LocalTime timeAppoinmet, Patient patient, Doctor doctor) {
		super();
		this.idMeducalAppoinmet = idMeducalAppoinmet;
		this.timeAppoinmet = timeAppoinmet;
		this.patient = patient;
		this.doctor = doctor;
	}
	
	

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.idMeducalAppoinmet);
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		MedicalAppoinmet auxMedicalA = (MedicalAppoinmet) obj;
		return this.idMeducalAppoinmet.equals(auxMedicalA.getIdMeducalAppoinmet());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "MedicalAppoinmet [idMeducalAppoinmet=" + idMeducalAppoinmet + ", timeAppoinmet=" + timeAppoinmet
				+ ", patient=" + patient + ", doctor=" + doctor + "]";
	}



	/**
	 * Método encargado de retornar el valor de idMeducalAppoinmet.
	 *
	 * @return valor de idMeducalAppoinmet
	 */
	public Integer getIdMeducalAppoinmet() {
		return idMeducalAppoinmet;
	}

	/**
	 * Método encargado de establecer el valor de idMeducalAppoinmet.
	 *
	 * @param idMeducalAppoinmet nuevo valor de idMeducalAppoinmet
	 */
	public void setIdMeducalAppoinmet(Integer idMeducalAppoinmet) {
		this.idMeducalAppoinmet = idMeducalAppoinmet;
	}

	/**
	 * Método encargado de retornar el valor de timeAppoinmet.
	 *
	 * @return valor de timeAppoinmet
	 */
	public LocalTime getTimeAppoinmet() {
		return timeAppoinmet;
	}

	/**
	 * Método encargado de establecer el valor de timeAppoinmet.
	 *
	 * @param timeAppoinmet nuevo valor de timeAppoinmet
	 */
	public void setTimeAppoinmet(LocalTime timeAppoinmet) {
		this.timeAppoinmet = timeAppoinmet;
	}

	/**
	 * Método encargado de retornar el valor de patient.
	 *
	 * @return valor de patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * Método encargado de establecer el valor de patient.
	 *
	 * @param patient nuevo valor de patient
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * Método encargado de retornar el valor de doctor.
	 *
	 * @return valor de doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}

	/**
	 * Método encargado de establecer el valor de doctor.
	 *
	 * @param doctor nuevo valor de doctor
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	
}
