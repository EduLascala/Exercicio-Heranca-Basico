package heranca;

public abstract class Animal {
	private double peso;
	private String comida;
	
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public String getComida() {
		return comida;
	}
	
	public void comer() {
		System.out.println("Comeu...");
	}
	
	public void dormir() {
		System.out.println("Dormiu...");
	}
	
	public void movimentar() {
		System.out.println("Mexeu...");
	}
	
	public void fazerBarulho() {
		System.out.println("Fez barunho...");
	}
	
	public abstract void cacar();	
}
