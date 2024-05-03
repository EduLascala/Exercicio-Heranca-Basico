package heranca;

public class Cachorro extends Canino{

	public Cachorro(double peso, String comida) {
		super(peso, comida);
	}
	
	public void enterrarOsso() {
		System.out.println("Enterrou o osso...");
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Latiu...");
	}

	@Override
	public void cacar() {
		System.out.println("Cachorro pegou a presa");
	}
}
