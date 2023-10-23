package br.com.fiap.beans;

public class Leads {
	private int idLeads, idUsuario;
	private String emailUsuario, numeroUsuario;
	
	public void salvarLeads(int idUsuario, String emailUsuario, String numeroUsuario) {
		
	}
	
	public void listarLeads(){
		
		
	}

	public int getIdLeads() {
		return idLeads;
	}

	public void setIdLeads(int idLeads) {
		this.idLeads = idLeads;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getNumeroUsuario() {
		return numeroUsuario;
	}

	public void setNumeroUsuario(String numeroUsuario) {
		this.numeroUsuario = numeroUsuario;
	}

	public Leads() {
		super();
	}

	public Leads(int idLeads, int idUsuario, String emailUsuario, String numeroUsuario) {
		super();
		this.idLeads = idLeads;
		this.idUsuario = idUsuario;
		this.emailUsuario = emailUsuario;
		this.numeroUsuario = numeroUsuario;
	}

	
	
}
