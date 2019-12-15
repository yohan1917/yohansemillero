/**
 * GestionarComicBean.java
 */
package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.logging.Logger;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.dto.RolDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Personaje;
import com.hbt.semillero.entidad.Rol;

/**
 * <b>Descripción:<b> Clase que determina el bean para realizar las gestion de
 * los Personajes
 * 
 * @author Yohan Narvaez Martinez
 * @version
 */
@Stateless
public class GestionarRolBean implements IGestionarRolLocal {

	final static Logger logger = Logger.getLogger(GestionarRolBean.class);
	
	/**
	 * Atributo em que se usa para interacturar con el contexto de persistencia.
	 */
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * 
	 * Metodo que se utiliza para crear un personaje
	 */
	@Override
	public void crearRol(RolDTO rolDTO) {
		logger.debug("Inicio del metodo crear personaje");
		Rol rol = convertirDTOEntidad(rolDTO);
		entityManager.persist(rol);
		logger.debug("Fin del metodo crear personaje");
	}

	/**
	 * 
	 * Metodo que se utiliza para modificar un personaje
	 */
	@Override
	public void modificarRol() {
		logger.debug("Inicio del metodo modificar personaje");
		
		logger.debug("Fin del metodo crear personaje");
	}

	/**
	 * 
	 * Metodo que se utiliza para eliminar un personaje
	 */
	@Override
	public void eliminarRol() {
		logger.debug("Inicio del metodo eliminar personaje");
		
		logger.debug("Fin del metodo eliminar personaje");
	}

	/**
	 * 
	 * Metodo que se utiliza para consultar un personaje
	 */
	
	@Override
	public void consultarRol() {
		// TODO Auto-generated method stub
	
	}

	@Override
	public List<RolDTO> consultarRoles(){
		
		String query = "SELEC rol"
				+ "FROM Rol rol";
		
		List<Rol> listaRoles = entityManager.createQuery(query).getResultList();
		
		List<RolDTO> listaRolesDTO = new ArrayList<>();
		
		for (Rol rol : listaRoles) {
			listaRolesDTO.add(convertirEntidadDTO(rol));
		}
		return listaRolesDTO;
		
	}
	
	@Override
	public List<RolDTO> consultarRoles(Long idPersonaje){
		String query = "SELECT rol "
				+ "FROM Rol rol "
				+ "WHERE rol.personaje.id = :idPersonaje";
		
		List<Rol> listaRoles = entityManager.createQuery(query).setParameter("idPersonaje", idPersonaje).getResultList();
		
		List<RolDTO> listaRolesDTO = new ArrayList<>();
		
		for(Rol rol : listaRoles) {
			listaRolesDTO.add(convertirEntidadDTO(rol));
		}
		
		return listaRolesDTO;	
	}
	
	
	
	
	private Rol convertirDTOEntidad(RolDTO rolDTO) {
		Rol Rol = new Rol();
		Rol.setId(rolDTO.getId());
		Rol.setNombre(rolDTO.getNombre());
		Rol.setPersonaje(new Personaje());
		Rol.getPersonaje().setId(rolDTO.getIdPersonaje());
		Rol.setEstado(rolDTO.getEstado());		
		return Rol;
	}
	
	private RolDTO convertirEntidadDTO(Rol rol) {
		RolDTO RolDTO = new RolDTO();
		RolDTO.setId(rol.getId());
		RolDTO.setNombre(rol.getNombre());
		RolDTO.setIdPersonaje(rol.getPersonaje().getId());
		RolDTO.setEstado(rol.getEstado());		
		return RolDTO;
	}
}
