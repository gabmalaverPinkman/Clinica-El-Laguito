/**
 * 
 */
package co.edu.uptc.clinic.service;

import java.util.HashMap;
import java.util.TreeSet;

import co.edu.uptc.clinic.domain.Doctor;
import co.edu.uptc.clinic.repository.DoctorRepository;

/**
 * Nombre de la clase: DoctorService
 *
 * <p>Contiene la logica de negocio de la clase doctor</p>
 *
 * <p><b>Responsabilidades:</b></p>
 * <ul>
 *   <li>Hacer las respectivas validaciones antes de emplear los métodos de la clase repository</li>
 * </ul>
 *
 *
 * @author gabma
 * @version 1.0
 * @since 9/05/2026
 */
public class DoctorService {
	
	/**
	 * Atributo que determina el repositorio de los médicos 
	 */
	private DoctorRepository doctorRepository;

	public DoctorService(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de validar los datos de cada doctor
	 *  y la existencia de un doctor con ese id<br>
	 * 
	 * @author gabma
	 *
	 * @param doctor Recibe un objeto de tipo doctor
	 * @return
	 * @return boolean Retorna False si hay algun dato de doctor no valido y 
	 * un doctor con ese mismo id. Retorna true si sus datos son válidos y si no 
	 * hay ya un registro de doctor con ese id.
	 * 
	 */
	public boolean validation(Doctor doctor) {
		if(doctor.getMedicalId() == null || doctor.getMedicalId() <= 0) {
			return false;
		}
		if (doctor.getFirstName() == null || doctor.getFirstName().isBlank()) {
			return false;
		}
		if(doctor.getLastName() == null || doctor.getLastName().isBlank()) {
			return false;
		}
		if(doctor.getSpecialty() == null || doctor.getSpecialty().isBlank()) {
			return false;
		}
		if(doctor.getYearsOfExperience() == null || doctor.getYearsOfExperience() <= 0) {
			return false;
		}
		if(doctorRepository.existById(doctor.getMedicalId())) {
			return false;
		}
		return true;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de Añadir un doctor al sistema <br>
	 * 
	 * @author gabma
	 *
	 * @param doctor Recibe un objeto de tipo doctor
	 * @return
	 * @return boolean Retorna True si fue posible añadir al nuevo doctor y false si no, estó segun el resultado de la validación. 
	 */
	public boolean addDoctor(Doctor doctor) {
		if(validation(doctor)) {
			return this.doctorRepository.addDoctor(doctor);
		}
		return false;
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de determinar si un doctor existe según su id<br>
	 * 
	 * @author gabma
	 *
	 * @param id Recibe el id del doctor a buscar en el sistema
	 * @return
	 * @return boolean Returna true si existe un doctor con el id que se recibio, y false si no 
	 * encontró un doctor con ese id
	 */
	public boolean existById(Integer id) {
		if(id == null || id <= 0) {
			return false;
		}
		return doctorRepository.existById(id);
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de buscary devolver un doctor en el sistema  <br>
	 * 
	 * @author gabma
	 *
	 * @param id Recibe el id del doctor a buscar
	 * @return
	 * @return Doctor Retorna el doctor encontrado.
	 * @throws Exception [Condición en la que ocurre]
	 */
	public Doctor findById(Integer id) {
		if(id == null || id <= 0) {
			return null;
		}
		return doctorRepository.findById(id);
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de devolver la información de los doctores registrados en el sistema <br>
	 * 
	 * @author gabma
	 *
	 * @return
	 * @return HashMap<Integer,Doctor> Retorna la información de los Doctores registrados
	 */
	public HashMap<Integer, Doctor> findAll(){
		return this.doctorRepository.findAll();
	}
	
	/**
	 * <b>Descripción: </b> Método encargado de devolver un conjunto de doctores ordenado por experiencia <br>
	 * 
	 * @author gabma
	 *
	 * @return
	 * @return TreeSet<Doctor> Retorna un conjunto de doctores ordenado
	 */
	public TreeSet<Doctor> findAllOrderedExp(){
		TreeSet<Doctor> doctorsOrdered = new TreeSet<>();
		doctorsOrdered.addAll(doctorRepository.findAll().values());
		return doctorsOrdered;
	}

	/**
	 * Método encargado de retornar el valor de doctorRepository.
	 *
	 * @return valor de doctorRepository
	 */
	public DoctorRepository getDoctorRepository() {
		return doctorRepository;
	}

	/**
	 * Método encargado de establecer el valor de doctorRepository.
	 *
	 * @param doctorRepository nuevo valor de doctorRepository
	 */
	public void setDoctorRepository(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}
	
	

}
