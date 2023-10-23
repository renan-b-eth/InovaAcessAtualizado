package br.com.fiap.beans;

public class Acessibilidade {
	
	private int idAcessibilidade;
	private boolean precisaAcessibilidade;
	
	public void ativarAcessibilidade(int idAcesibilidade) {
		
	}
	public void desativarAcessibilidade(int idAcesibilidade) {
		
	}
	
	public int getIdAcessibilidade() {
		return idAcessibilidade;
	}
	public void setIdAcessibilidade(int idAcessibilidade) {
		this.idAcessibilidade = idAcessibilidade;
	}
	public boolean isPrecisaAcessibilidade() {
		return precisaAcessibilidade;
	}
	public void setPrecisaAcessibilidade(boolean precisaAcessibilidade) {
		this.precisaAcessibilidade = precisaAcessibilidade;
	}
	public Acessibilidade(int idAcessibilidade, boolean precisaAcessibilidade) {
		super();
		this.idAcessibilidade = idAcessibilidade;
		this.precisaAcessibilidade = precisaAcessibilidade;
	}
	public Acessibilidade() {
		super();
	}
	
	
}
