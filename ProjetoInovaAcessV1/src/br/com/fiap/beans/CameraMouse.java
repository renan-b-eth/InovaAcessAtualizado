package br.com.fiap.beans;

public class CameraMouse {
	
	private int idCamerMouse, idAcessibilidade;
	
	public void ativarCameraMouse(){
		
	}
	
	public void desativarCameraMouse() {
		
	}

	public int getIdCamerMouse() {
		return idCamerMouse;
	}

	public void setIdCamerMouse(int idCamerMouse) {
		this.idCamerMouse = idCamerMouse;
	}

	public int getIdAcessibilidade() {
		return idAcessibilidade;
	}

	public void setIdAcessibilidade(int idAcessibilidade) {
		this.idAcessibilidade = idAcessibilidade;
	}

	public CameraMouse() {
		super();
	}

	public CameraMouse(int idCamerMouse, int idAcessibilidade) {
		super();
		this.idCamerMouse = idCamerMouse;
		this.idAcessibilidade = idAcessibilidade;
	}
	
	
}
