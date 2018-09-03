package br.com.cvc.businessRules.errors;

public class ErrorsMessage {
	String causa;
	String codigo;
	public ErrorsMessage(String causa, String codigo) {
		this.causa=causa;
		this.codigo=codigo;
	}
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
