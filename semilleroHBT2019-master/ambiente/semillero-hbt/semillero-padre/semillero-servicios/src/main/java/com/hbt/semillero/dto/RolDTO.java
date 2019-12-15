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
public class RolDTO implements Serializable {

	/**
	 * Atributo que determina
	 */
	

	private long id;
	private String nombre;
	private long idPersonaje;	
	private EstadoEnum estado;	
	
	
	
	
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

	public long getIdPersonaje() {
		return idPersonaje;
	}

	public void setIdPersonaje(long idPersonaje) {
		this.idPersonaje = idPersonaje;
	}

	public EstadoEnum getEstado() {
		return estado;
	}

	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}

	public static RolDTO valueOf(String arg) {
		return JsonUtils.valueOf(arg, RolDTO.class);
	}
	
	@Override
	public String toString() {
		return JsonUtils.toStringJson(this);
	}

}
