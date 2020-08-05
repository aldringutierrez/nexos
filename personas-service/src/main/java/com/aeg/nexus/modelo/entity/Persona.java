package com.aeg.nexus.modelo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="personas")
public class Persona implements Serializable {
	private static final long serialVersionUID = -2422935585833898623L;
	@Id
	@Column(name="id_persona")
	@SequenceGenerator(name="SEQ_PERSONAS")
	@GeneratedValue
	Long   idPersona;
	@Column(name="id_padre")
	Long   idpadre;
	String nombre;
	String correo;
	String parentesco;
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public Long getIdpadre() {
		return idpadre;
	}
	public void setIdpadre(Long idpadre) {
		this.idpadre = idpadre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	

}
