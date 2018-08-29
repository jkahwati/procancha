package procancha.app.login.entity;

import javax.persistence.*;

/**
 * The persistent class for the USUARIOS database table.
 * 
 */
@Entity
@Table(name="usuarios")
public class Usuario{

	@Id
	@Column(name="id_usuario")
	private Integer idUsuario;
	
	private String rut;
	
	@ManyToOne()
	@JoinColumn(name="id_rol")
    private Rol rol;


	public Usuario() { 
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}


	public Rol getRol() {
		return rol;
	}


	public void setRol(Rol rol) {
		this.rol = rol;
	}

}