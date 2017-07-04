package lab4;

import java.util.ArrayList;

public class Sistema {
	
	private int caixa;
	private double taxa;
	
	public Sistema(int caixa, double taxa) {
		this.caixa = caixa;
		this.taxa = taxa;
	}
	
	public void recebeAposta(){
		
	}

	public int getCaixa() {
		return caixa;
	}

	public void setCaixa(int caixa) {
		this.caixa = caixa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
	
}
