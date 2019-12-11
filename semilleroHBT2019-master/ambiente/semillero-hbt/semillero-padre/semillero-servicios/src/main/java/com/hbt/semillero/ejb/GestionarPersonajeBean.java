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
import com.hbt.semillero.entidad.Comic;

/**
 * <b>Descripción:<b> Clase que determina el bean para realizar las gestion de
 * los Personajes
 * 
 * @author Yohan Narvaez Martinez
 * @version
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarPersonajeBean implements IGestionarPersonajeLocal {

	final static Logger logger = Logger.getLogger(GestionarPersonajeBean.class);
	
	/**
	 * Atributo em que se usa para interacturar con el contexto de persistencia.
	 */
	@PersistenceContext
	private EntityManager em;

	/**
	 * 
	 * Metodo que se utiliza para crear un personaje
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearPersonaje() {
		logger.debug("Inicio del metodo crear personaje");
		
		logger.debug("Fin del metodo crear personaje");
	}

	/**
	 * 
	 * Metodo que se utiliza para modificar un personaje
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void modificarPersonaje() {
		logger.debug("Inicio del metodo modificar personaje");
		
		logger.debug("Fin del metodo crear personaje");
	}

	/**
	 * 
	 * Metodo que se utiliza para eliminar un personaje
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
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

	
}
