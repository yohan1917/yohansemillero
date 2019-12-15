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
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Personaje;

/**
 * <b>Descripción:<b> Clase que determina el bean para realizar las gestion de
 * los Personajes
 * 
 * @author Yohan Narvaez Martinez
 * @version
 */
@Stateless
public class GestionarPersonajeBean implements IGestionarPersonajeLocal {

	final static Logger logger = Logger.getLogger(GestionarPersonajeBean.class);
	
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
	public void crearPersonaje(PersonajeDTO personajeDTO) {
		logger.debug("Inicio del metodo crear personaje");
		Personaje personaje = convertirDTOEntidad(personajeDTO);
		entityManager.persist(personaje);
		logger.debug("Fin del metodo crear personaje");
	}

	/**
	 * 
	 * Metodo que se utiliza para modificar un personaje
	 */
	@Override
	public void modificarPersonaje() {
		logger.debug("Inicio del metodo modificar personaje");
		
		logger.debug("Fin del metodo crear personaje");
	}

	/**
	 * 
	 * Metodo que se utiliza para eliminar un personaje
	 */
	@Override
	public void eliminarPersonaje() {
		logger.debug("Inicio del metodo eliminar personaje");
		
		logger.debug("Fin del metodo eliminar personaje");
	}

	/**
	 * 
	 * Metodo que se utiliza para consultar un personaje
	 */
	
	@Override
	public void consultarPersonaje() {
		// TODO Auto-generated method stub
	
	}

	@Override
	public List<PersonajeDTO> consultarPersonajes(){
		
		String query = "SELEC personaje"
				+ "FROM Personaje personaje";
		
		List<Personaje> listaPersonajes = entityManager.createQuery(query).getResultList();
		
		List<PersonajeDTO> listaPersonajesDTO = new ArrayList<>();
		
		for (Personaje personaje : listaPersonajes) {
			listaPersonajesDTO.add(convertirEntidadDTO(personaje));
		}
		return listaPersonajesDTO;
		
	}
	
	@Override
	public List<PersonajeDTO> consultarPersonajes(Long idComic){
		String query = "SELECT personaje "
				+ "FROM Personaje personaje "
				+ "WHERE personaje.comic.id = :idComic";
		
		List<Personaje> listaPersonajes = entityManager.createQuery(query).setParameter("idComic", idComic).getResultList();
		
		List<PersonajeDTO> listaPersonajesDTO = new ArrayList<>();
		
		for(Personaje personaje : listaPersonajes) {
			listaPersonajesDTO.add(convertirEntidadDTO(personaje));
		}
		
		return listaPersonajesDTO;	
	}
	
	
	
	
	private Personaje convertirDTOEntidad(PersonajeDTO personajeDTO) {
		Personaje Personaje = new Personaje();
		Personaje.setId(personajeDTO.getId());
		Personaje.setNombre(personajeDTO.getNombre());
		Personaje.setComic(new Comic());
		Personaje.getComic().setId(personajeDTO.getIdComic());
		Personaje.setEstado(personajeDTO.getEstado());
		Personaje.setSuperPoder(personajeDTO.getSuperPoder());
		return Personaje;
	}
	
	private PersonajeDTO convertirEntidadDTO(Personaje personaje) {
		PersonajeDTO PersonajeDTO = new PersonajeDTO();
		PersonajeDTO.setId(personaje.getId());
		PersonajeDTO.setNombre(personaje.getNombre());
		PersonajeDTO.setIdComic(personaje.getComic().getId());
		PersonajeDTO.setEstado(personaje.getEstado());
		PersonajeDTO.setSuperPoder(personaje.getSuperPoder());
		return PersonajeDTO;
	}
}
