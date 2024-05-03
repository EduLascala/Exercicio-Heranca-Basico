package heranca;

public abstract class Canino extends Animal{

	public Canino(double peso, String comida) {
		super(peso, comida);
	}

	@Override
	public abstract void cacar();

	public abstract void enterrarOsso();
}
