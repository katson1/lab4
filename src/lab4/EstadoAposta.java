package lab4;

public enum EstadoAposta {
	finalizadoNaoOcorreu("Finalizado (ocorreu)"), 
	nfinalizado("Não finalizado"),
	finalizadoOcorreu("Finalizado (n ocorreu)");
	

	private String estado;
	private EstadoAposta(String estado){
		this.estado = estado;
		
	}
	
	public String getEstadoaposta(){
		return estado;
	}
	
}
