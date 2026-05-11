package co.edu.uptc.clinic.service;

import java.util.TreeSet;

import co.edu.uptc.clinic.domain.Doctor;
import co.edu.uptc.clinic.domain.MedicalAppoinmet;
import co.edu.uptc.clinic.domain.Patient;
import co.edu.uptc.clinic.repository.MedicalAppoinmetRespository;

/**
 * Nombre de la clase: MedicalAppoinmetService
 *
 * <p>llevar a cabo las validaciones de la clase MedicalAppoinmet</p>
 *
 * <p><b>Responsabilidades:</b></p>
 * <ul>
 *   <li>Validar los datos de cada cita médica y emplear los metodos de la clase Repository</li>
 * </ul>
 *
 * @author gabma
 * @version 1.0
 * @since 10/05/2026
 */
public class MedicalAppoinmetService {
	
	/**
	 * Atributo que determina el repositorio de citas
	 */
	private MedicalAppoinmetRespository medicalAppoinmetRespository;
	
	/**
	 * Atributo que determina el service de doctores
	 */
	private DoctorService doctorService;
	
	/**
	 * Atributo que determina el service de pacientes
	 */
	private PatientService patientService;

	/**
	 * Crea una nueva instancia de MedicalAppoinmetService.
	 *
	 * @param medicalAppoinmetRespository
	 * @param doctorService
	 * @param patientService 
	 */
	public MedicalAppoinmetService(MedicalAppoinmetRespository medicalAppoinmetRespository, DoctorService doctorService,
			PatientService patientService) {
		super();
		this.medicalAppoinmetRespository = medicalAppoinmetRespository;
		this.doctorService = doctorService;
		this.patientService = patientService;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de las validaciones de MedicalAppoinmet<br>
	 * 
	 * @author gabma
	 *
	 * @param medicalAppoinmet Recibe una cita médica
	 * @return
	 * @return boolean Retorna Verdadero si la cita recibida es valida para ser agregada al sistema
	 */
	public boolean validate(MedicalAppoinmet medicalAppoinmet) {
		if(medicalAppoinmetRespository.existById(medicalAppoinmet.getIdMeducalAppoinmet())) {
			return false;
		}
		if(medicalAppoinmet.getIdMeducalAppoinmet() == 0 || medicalAppoinmet.getIdMeducalAppoinmet() <= 0) {
			return false;
		}
		if(medicalAppoinmet.getTimeAppoinmet() == null) {
			return false;
		}
		if(patientService.existById(medicalAppoinmet.getPatient().getIdPatient())) {
			return false;
		}
		if(doctorService.existById(medicalAppoinmet.getDoctor().getMedicalId())) {
			return false;
		}
		return true;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de Añadir una nueva cita médica al sistema. <br>
	 * 
	 * @author gabma
	 *
	 * @param medicalAppoinmet Recibe una cita médica
	 * @return
	 * @return boolean Retorna true si fue posible agregar la cita despues de validarla,
	 * y false si no fue posible.
	 */
	public boolean addMedicalAppoinmet(MedicalAppoinmet medicalAppoinmet) {
		if(validate(medicalAppoinmet)) {
			medicalAppoinmetRespository.addMedicalAppoinmet(medicalAppoinmet);
			return true;
		}
		return false;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de verificar si existe una cita médica en el 
	 * sistema luego de validar el id <br>
	 * 
	 * @author gabma
	 *
	 * @param id recibe el id de la cita a verificar
	 * @return
	 * @return boolean Retorna true si la cita existe en el programa, y false si no existe
	 */
	public boolean existById(Integer id) {
		if(id == 0 || id <= 0) {
			return false;
		}
		return medicalAppoinmetRespository.existById(id);
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de devolver una cita medica <br>
	 * 
	 * @author gabma
	 *
	 * @param id Recibe el id de la cita a buscar
	 * @return
	 * @return MedicalAppoinmet Retorna la cita encontrada
	 */
	public MedicalAppoinmet findById(Integer id) {
		if(id == 0 || id <= 0) {
			return null;
		}
		return medicalAppoinmetRespository.findById(id);
	}

	/**
	 * <b>Descripción: </b> Método encargado de devolver el conjunto de citas según la hora. <br>
	 * 
	 * @author gabma
	 *
	 * @return
	 * @return TreeSet<MedicalAppoinmet> retorna el conjunto de citas ordenado
	 */
	public TreeSet<MedicalAppoinmet> findAllByTimeAndPriority() {
		TreeSet<MedicalAppoinmet> appoinmetOrder = new TreeSet<>((a, b) -> {
			int byTime = a.getTimeAppoinmet().compareTo(b.getTimeAppoinmet());
			if (byTime == 0) {
				return Integer.compare(b.getPatient().getPriority().getOficialValue(),
						a.getPatient().getPriority().getOficialValue());
			}
			return byTime;
		});
		
		appoinmetOrder.addAll(medicalAppoinmetRespository.findAll().values());
		return appoinmetOrder;
	}
	
	/**
	 * Método encargado de retornar el valor de medicalAppoinmetRespository.
	 *
	 * @return valor de medicalAppoinmetRespository
	 */
	public MedicalAppoinmetRespository getMedicalAppoinmetRespository() {
		return medicalAppoinmetRespository;
	}

	/**
	 * Método encargado de establecer el valor de medicalAppoinmetRespository.
	 *
	 * @param medicalAppoinmetRespository nuevo valor de medicalAppoinmetRespository
	 */
	public void setMedicalAppoinmetRespository(MedicalAppoinmetRespository medicalAppoinmetRespository) {
		this.medicalAppoinmetRespository = medicalAppoinmetRespository;
	}

	/**
	 * Método encargado de retornar el valor de doctorService.
	 *
	 * @return valor de doctorService
	 */
	public DoctorService getDoctorService() {
		return doctorService;
	}

	/**
	 * Método encargado de establecer el valor de doctorService.
	 *
	 * @param doctorService nuevo valor de doctorService
	 */
	public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}

	/**
	 * Método encargado de retornar el valor de patientService.
	 *
	 * @return valor de patientService
	 */
	public PatientService getPatientService() {
		return patientService;
	}

	/**
	 * Método encargado de establecer el valor de patientService.
	 *
	 * @param patientService nuevo valor de patientService
	 */
	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}
	
	
	
	

}
