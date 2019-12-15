/**
 * GestionarComicRest.java
 */
package com.hbt.semillero.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.dto.RolDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;
import com.hbt.semillero.ejb.IGestionarPersonajeLocal;
import com.hbt.semillero.ejb.IGestionarRolLocal;

/**
 * <b>Descripción:<b> Clase que determina el servicio rest que permite gestionar
 * un comic
 * 
 * @author ccastano
 * @version
 */
@Path("/GestionarRol")
public class GestionarRolRest {

	/**
	 * Atriburo que permite gestionar un comic
	 */
	@EJB
	private IGestionarRolLocal gestionarRolBean;

	

	/**
	 * 
	 * Metodo encargado de traer la informacion de un comic determiando
	 * http://localhost:8085/semillero-servicios/rest/GestionarComic/consultarComics
	 * 
	 * @param idComic
	 * @return
	 */
	@GET
	@Path("/consultarRoles")
	@Produces(MediaType.APPLICATION_JSON)
	public List<RolDTO> consultarRoles() {
		return gestionarRolBean.consultarRoles();

	}

	/**
	 * 
	 * Metodo encargado de traer la informacion de un comic determiando
	 * http://localhost:8085/semillero-servicios/rest/GestionarComic/consultarComics
	 * 
	 * @param idComic
	 * @return
	 */
	@GET
	@Path("/consultarRolesPorId")
	@Produces(MediaType.APPLICATION_JSON)
	public List<RolDTO> consultarRol(@QueryParam("idComic") long idPersonaje) {
		return gestionarRolBean.consultarRoles(idPersonaje);

	}

	
	/**
	 * Crea las personas en sus diferentes roles dentro del sistema.
	 * http://localhost:8085/semillero-servicios/rest/GestionarComic/crear
	 * @param persona
	 * @return
	 */
	@POST
	@Path("/crear")
	public void crearRol(RolDTO rolDTO) {
		gestionarRolBean.crearRol(rolDTO);		
		
	}

}
