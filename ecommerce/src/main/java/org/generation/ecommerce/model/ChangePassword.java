package org.generation.ecommerce.model;

//DTO
//Data transfer Object
//Objeto que solo nos permite recibir y enviar información desde el cliente.
public class ChangePassword {
	private String password;
	private String npassword;
	public ChangePassword(String password, String npassword) {
		super();
		this.password = password;
		this.npassword = npassword;
	}
	
	public ChangePassword() {
		// TODO Auto-generated constructor stub
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNpassword() {
		return npassword;
	}
	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}
	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", npassword=" + npassword + "]";
	}
	
	
}//class ChangePassword
