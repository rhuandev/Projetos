package controller;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

import model.IModel;
import model.IModelImpl;
import view.IView;
import view.ViewImpl;

public class Controller {

	public static void main (String[] args) {
		new Controller (new ViewImpl(), new IModelImpl()).startMenu();

	}					//FAZER SUAVIEW()
	
	private static IView view;
	private IModel model;
	private Map <Integer, BooleanSupplier> funcionalidades = new HashMap <> ();
	
	public Controller(IView view, IModel model) {
		super();
		Controller.view = view;
		this.model = model;
		
		funcionalidades.put (1, () -> {
			if(model.contadorDeMana <= 0) {
				System.out.println("Mana Insuficiente!");
				System.out.println("Mana: " + model.contadorDeMana);
			}
			else {
			view.mostrarResultado(model.castarMagia());
			return true;
			}
		return true;
		});
		
		funcionalidades.put (2, () -> {
			view.mostrarResultado(model.checarMana());
			return true;
		});

		funcionalidades.put (3, () -> {
			view.mostrarResultado(model.beberPocaoDeMana());
			return true;
		});
		
		funcionalidades.put (4, () -> {
			view.mostrarSuicidio();
			return false;
		});

	}
	
	public void startMenu() {
		System.out.println("Bem vindo ao MAGE CASTER 2000");
		int opcao;
		view.mostrarMenu();
		opcao = view.capturarOpcao();
		

		while(opcao != 4){
			if(opcao > 4 || opcao <= 0) {
				view.mostrarMenssagemDeErro();
				view.mostrarMenu();
				opcao = view.capturarOpcao();
			}
			else { 
				while (funcionalidades.get(opcao).getAsBoolean()) {
					view.mostrarMenu();
					opcao = view.capturarOpcao();
					if(opcao > 4 || opcao <= 0) {
						view.mostrarMenssagemDeErro();
						break;
					}else if (opcao == 4) {
						break;
					}
				}
			}
		} 
		view.mostrarSuicidio();
	}
}
