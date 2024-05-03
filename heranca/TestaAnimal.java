package heranca;

public class TestaAnimal {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro(5, "Ração Natural");
		Galinha galinha1 = new Galinha(1, "Milho");
		Coruja coruja1 = new Coruja(0.5, "Rato");
		
		System.out.println("Cachorro");
		System.out.println("Peso: " + cachorro1.getPeso());
		System.out.println("Comida: " + cachorro1.getComida());
		cachorro1.cacar();
		cachorro1.comer();
		cachorro1.movimentar();
		cachorro1.enterrarOsso();
		cachorro1.dormir();
		cachorro1.fazerBarulho();
		
		System.out.println("-------------------");
		
		System.out.println("Galinha");
		System.out.println("Peso: " + galinha1.getPeso());
		System.out.println("Comida: " + galinha1.getComida());
		galinha1.cacar();
		galinha1.comer();
		galinha1.voar();
		galinha1.botar();
		galinha1.movimentar();
		galinha1.dormir();
		galinha1.fazerBarulho();
		galinha1.reproduzir();
		
		System.out.println("-------------------");
		
		System.out.println("Coruja");
		System.out.println("Peso: " + coruja1.getPeso());
		System.out.println("Comida: " + coruja1.getComida());
		coruja1.cacar();
		coruja1.comer();
		coruja1.voar();
		coruja1.botar();
		coruja1.movimentar();
		coruja1.dormir();
		coruja1.fazerBarulho();
	}

}



