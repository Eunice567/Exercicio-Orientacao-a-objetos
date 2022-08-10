package entities;

public class Salario {
	public String nome;
	public double sBruto;
	public double taxa;
	
	
	
	public double novoSal() {
		return sBruto - taxa; 
	}
	
	public void incrementSal(double porcent) {
		sBruto += sBruto * porcent / 100.00;
	}
	
	public String toString() {
		return nome + ", $" + String.format("%.2f%n", novoSal());
	}
}
