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

	}					
	
	private static IView view;
	private IModel model;
	private Map <Integer, BooleanSupplier> funcionalidades = new HashMap <> ();
	
	public Controller(IView view, IModel model) {
		super();
		Controller.view = view;
		this.model = model;
		
		funcionalidades.put (1, () -> {
			view.mostrarResultado(model.incrementar());
			return true;
		});
		
		funcionalidades.put (2, () -> {
			view.mostrarResultado(model.decrementar());
			return true;
		});

		funcionalidades.put (3, () -> {
			view.mostrarAteLogo();
			return false;
		});

	}
	
	public void startMenu() {
		int opcao;
		view.mostrarMenu();
		opcao = view.capturarOpcao();
		
		if(opcao == 3) {
			view.mostrarAteLogo();
		}
		
		while(opcao != 3){
			if(opcao > 3 || opcao <= 0) {
				view.mostrarMenssagemDeErro();
				view.mostrarMenu();
				opcao = view.capturarOpcao();
			}
			else { 
				while (funcionalidades.get(opcao).getAsBoolean()) {
					view.mostrarMenu();
					opcao = view.capturarOpcao();
					if(opcao > 3 || opcao <= 0) {
						view.mostrarMenssagemDeErro();
						break;
					}
				}
			}
		} 
		
	}
}
