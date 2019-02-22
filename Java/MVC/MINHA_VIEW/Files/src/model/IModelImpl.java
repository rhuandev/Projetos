package model;

public class IModelImpl extends IModel{

	@Override
	public int castarMagia() {
		System.out.println("Castando magia...\n" + "Mana restante: ");
		return contadorDeMana = contadorDeMana - 10;
	}

	@Override
	public int beberPocaoDeMana() {
		System.out.println("Bebendo poção de mana\n" + "Mana total: ");
		return contadorDeMana = contadorDeMana + 10;
	}


	@Override
	public int checarMana() {
		System.out.println("Mana total: ");
		return contadorDeMana;
	}

	
	
}
