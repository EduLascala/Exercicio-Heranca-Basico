package heranca;

public class Coruja extends Ave{

	public Coruja(double peso, String comida) {
		super(peso, comida);
	}

	@Override
	public void cacar() {
		System.out.println("Ficou de tocaia...");
	}
	
	@Override
	public void voar() {
		System.out.println("Coruja Voou...");
	}

}
