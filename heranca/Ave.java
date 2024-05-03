package heranca;

public abstract class Ave extends Animal{

	public Ave(double peso, String comida) {
		super(peso, comida);
	}
	
	public abstract void voar();
	
	public void botar() {
		System.out.println("Botou um ovo...");
	}
	
	public void reproduzir() {
		System.out.println("Fazer ninho...");
	}
}
