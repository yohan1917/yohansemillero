package com.hbt.semillero.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.hbt.semillero.entidad.EstadoEnum;
import com.hbt.semillero.entidad.TematicaEnum;

/**
 * <b>Descripción:<b> Clase que determina el dto a usar para modificar,
 * consultar y posteriormente eliminar un personaje
 * 
 * @author Yohan Narvaez
 */
public class PersonajeDTO implements Serializable {

	/**
	 * Atributo que determina
	 */
	

	private long id;
	private String nombre;
	private long idComic;	
	private EstadoEnum estado;
	private String superPoder;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getIdComic() {
		return idComic;
	}
	public void setIdComic(long idComic) {
		this.idComic = idComic;
	}
	public EstadoEnum getEstado() {
		return estado;
	}
	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}
	public String getSuperPoder() {
		return superPoder;
	}
	public void setSuperPoder(String superPoder) {
		this.superPoder = superPoder;
	}

	public static PersonajeDTO valueOf(String arg) {
		return JsonUtils.valueOf(arg, PersonajeDTO.class);
	}
	
	@Override
	public String toString() {
		return JsonUtils.toStringJson(this);
	}

}
