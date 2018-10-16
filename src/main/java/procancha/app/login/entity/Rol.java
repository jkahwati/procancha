package procancha.app.login.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the ROLES database table.
 * 
 */
@Entity
@Table(name="roles")
public class Rol{

	@Id
	@Column(name="id_rol")
	private Integer idRol;
	
	private String descripcion;
	
//	@OneToMany(mappedBy = "rol")
//	@JsonIgnore
//	private List<Usuario> usuarios; 

	public Rol() { 
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

//	public List<Usuario> getUsuarios() {
//		return usuarios;
//	}
//
//	public void setUsuarios(List<Usuario> usuarios) {
//		this.usuarios = usuarios;
//	}

}