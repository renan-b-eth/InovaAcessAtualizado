package br.com.fiap.beans;

public class Login {
	private int idLogin, idUsuario;
	private String loginUsuario, senhaUsuario;
	
	public void realizarLogin(String loginUsuario, String senhaUsuario) {
		
	}
	public void alterarLogin(int idLogin) {
		
	}
	public void cadastrarLogin(String loginUsuario, String senhaUsuario) {
		
	}
	public Login(int idLogin, int idUsuario, String loginUsuario, String senhaUsuario) {
		super();
		this.idLogin = idLogin;
		this.idUsuario = idUsuario;
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
	}
	
	public Login() {
		super();
	}
	public int getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getLoginUsuario() {
		return loginUsuario;
	}
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
}
