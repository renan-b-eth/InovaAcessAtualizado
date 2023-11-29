package br.com.fiap.beans;

public class Usuario {
	
	private int idUsuario;
	private String nomeUsuario, emailUsuario, senhaUsuario, loginUsuario, telefoneUsuario;
	
	
	//Metodos do Usuario
	
	public void adicionarUsuario(Usuario user) {
		
	}
	public void editarUsuario(int idUsuario) {
		
	}
	public void excluirUsuario(int idUsuario) {
		
	}
	public void localizarUsuario(int idUsuario) {
		
	}
	public void validarUsuario() {
		
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getNomeUsuario() {
		return nomeUsuario;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}


	public String getEmailUsuario() {
		return emailUsuario;
	}


	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}


	public String getSenhaUsuario() {
		return senhaUsuario;
	}


	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}


	public String getLoginUsuario() {
		return loginUsuario;
	}


	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}


	public String getTelefoneUsuario() {
		return telefoneUsuario;
	}


	public void setTelefoneUsuario(String telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}


	public Usuario() {
		super();
	}


	public Usuario(int idUsuario, String nomeUsuario, String emailUsuario, String senhaUsuario, String loginUsuario,
			String telefoneUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.loginUsuario = loginUsuario;
		this.telefoneUsuario = telefoneUsuario;
	}
	
	
}
