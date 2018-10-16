package procancha.app.login.entity;

import javax.persistence.*;

/**
 * The persistent class for the USUARIOS database table.
 * 
 */
//@Entity
//@Table(name="usuarios")
public class Usuario{

//	@Id
//	@Column(name="id_usuario")
	private Integer id_usuario;
	
	private String rut;
	
	private String descripcion;
	
//	@ManyToOne()
//	@JoinColumn(name="id_rol")
    private Rol id_rol;


	public Usuario() { 
	}





	public Integer getId_usuario() {
		return id_usuario;
	}





	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}





	public String getRut() {
		return rut;
	}


	public void setRut(String rut) {
		this.rut = rut;
	}





	public Rol getId_rol() {
		return id_rol;
	}





	public void setId_rol(Rol id_rol) {
		this.id_rol = id_rol;
	}





	public String getDescripcion() {
		return descripcion;
	}





	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




}