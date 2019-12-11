package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.ComicDTO;

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
public interface IGestionarPersonajeLocal {

	/**
	 * 
	 * Metodo encargado de crear un personaje
	 * 
	 * @author cYohan Narvaez
	 * 
	 */
	public void crearPersonaje();

	/**
	 * 
	 * Metodo encargado de modificar un personaje
	 * 
	 * @author Yohan Narvaez
	 */
	public void modificarPersonaje();

	/**
	 * 
	 * Metodo encargado de eliminar un personaje 
	 * 
	 * @author Yohan Narvaez
	 * 
	 */
	public void eliminarPersonaje();

	/**
	 * 
	 * Metodo encargado de retornar la informacion de un personaje
	 * 
	 */
	public void consultarPersonaje();

	/**
	 * 
	 * Metodo encargado de retornar una lista de comics
	 * 
	 * @return
	 */
	
}
