package br.com.fiap.beans;

public class Logs {
	
	private int idLogs;
	private String dataLog, descricaoLog;
	
	public void exibirLogs() {
		
	}
	
	public int getIdLogs() {
		return idLogs;
	}
	public void setIdLogs(int idLogs) {
		this.idLogs = idLogs;
	}
	public String getDataLog() {
		return dataLog;
	}
	public void setDataLog(String dataLog) {
		this.dataLog = dataLog;
	}
	public String getDescricaoLog() {
		return descricaoLog;
	}
	public void setDescricaoLog(String descricaoLog) {
		this.descricaoLog = descricaoLog;
	}
	public Logs() {
		super();
	}
	public Logs(int idLogs, String dataLog, String descricaoLog) {
		super();
		this.idLogs = idLogs;
		this.dataLog = dataLog;
		this.descricaoLog = descricaoLog;
	}
	
}
