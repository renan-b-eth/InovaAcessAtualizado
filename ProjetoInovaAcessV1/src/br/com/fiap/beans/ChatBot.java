package br.com.fiap.beans;

public class ChatBot {

	private int idChatBot, idAcessibildiade, idUsuario;
	private String nomeCliente, emailCliente, telefoneCliente;
	
	public void iniciarConversa() {
		
	}
	public void resetarConversa() {
		
	}
	
	public void encerrarConversa() {
		
	}
	
	
	public ChatBot() {
		super();
	}
	public ChatBot(int idChatBot, int idAcessibildiade, int idUsuario, String nomeCliente, String emailCliente,
			String telefoneCliente) {
		super();
		this.idChatBot = idChatBot;
		this.idAcessibildiade = idAcessibildiade;
		this.idUsuario = idUsuario;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.telefoneCliente = telefoneCliente;
	}
	public int getIdChatBot() {
		return idChatBot;
	}
	public void setIdChatBot(int idChatBot) {
		this.idChatBot = idChatBot;
	}
	public int getIdAcessibildiade() {
		return idAcessibildiade;
	}
	public void setIdAcessibildiade(int idAcessibildiade) {
		this.idAcessibildiade = idAcessibildiade;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	
	
	
}
