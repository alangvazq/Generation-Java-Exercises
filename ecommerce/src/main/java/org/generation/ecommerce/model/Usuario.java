package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//POJO - Plain Old Java
@Entity
@Table(name="usuarios")

public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String password;
	
	public Usuario(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public Usuario() {
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	//0. cambiar en el application.properties = update
	//1. Constructor (email, password)
	//2. Constructor vacio
	//3. getter and setters (id->readonly)
	//4. toString
	
	//UsuarioController - NO hacer el update (PUT)
	//UsuarioService
	//UsuarioRepository
	
	
}
