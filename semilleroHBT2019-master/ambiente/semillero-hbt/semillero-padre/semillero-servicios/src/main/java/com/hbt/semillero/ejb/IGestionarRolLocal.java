package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.dto.RolDTO;

/**
 * Expone los métodos del EJB GestionarPersonaje Las interfaces determinan una
 * especie de contrato donde se define las firmas de los metodos, define que se
 * necesita implementar pero no el como eso lo realiza la clase que la
 * implementa Palabras claves interface e implements
 * 
 * @author Yohan Narvaez
 *
 */
@Local
public interface IGestionarRolLocal {

	/**
	 * 
	 * Metodo encargado de crear un personaje
	 * 
	 * @author Yohan Narvaez
	 * 
	 */
	public void crearRol(RolDTO rolDTO);

	/**
	 * 
	 * Metodo encargado de modificar un personaje
	 * 
	 * @author Yohan Narvaez
	 */
	public void modificarRol();

	/**
	 * 
	 * Metodo encargado de eliminar un personaje 
	 * 
	 * @author Yohan Narvaez
	 * 
	 */
	public void eliminarRol();

	/**
	 * 
	 * Metodo encargado de retornar la informacion de un personaje
	 * 
	 */
	public void consultarRol();

	/**
	 * 
	 * Metodo encargado de retornar una lista de comics
	 * 
	 * @return
	 */
	public List<RolDTO> consultarRoles();
	
	public List<RolDTO> consultarRoles(Long idPersonaje);
	

}
