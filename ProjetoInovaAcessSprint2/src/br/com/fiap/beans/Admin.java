package br.com.fiap.beans;

public class Admin extends Usuario{
	
	private int idAdmin;
	private String emailAdmin, senhaAdmin, nomeAdmin;
	
	public void adicionarUsuario(int idUsuario) {
		
	}
	
	public void removerUsuario(int idUsuario) {
		
	}
	
	public void alterarUsuario(int idUsuario) {
		
	}
	
	
	
	public int getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getEmailAdmin() {
		return emailAdmin;
	}
	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}
	public String getSenhaAdmin() {
		return senhaAdmin;
	}
	public void setSenhaAdmin(String senhaAdmin) {
		this.senhaAdmin = senhaAdmin;
	}
	public String getNomeAdmin() {
		return nomeAdmin;
	}
	public void setNomeAdmin(String nomeAdmin) {
		this.nomeAdmin = nomeAdmin;
	}
	public Admin(int idAdmin, String emailAdmin, String senhaAdmin, String nomeAdmin) {
		super();
		this.idAdmin = idAdmin;
		this.emailAdmin = emailAdmin;
		this.senhaAdmin = senhaAdmin;
		this.nomeAdmin = nomeAdmin;
	}
	public Admin() {
		super();
	}
	
	
	
}
