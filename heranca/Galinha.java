package heranca;

public class Galinha extends Ave{

	public Galinha(double peso, String comida) {
		super(peso, comida);
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Co co co...");
	}

	@Override
	public void cacar() {
		System.out.println("Ciscou o chão...");
	}
	
	@Override
	public void reproduzir() {
		super.reproduzir();
		System.out.println("Acasalar...");
	}
	
	@Override
	public void voar() {
		System.out.println("Galinha Voou...");
	}

}
