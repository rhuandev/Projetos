package view;

import java.util.Scanner;

public class ViewImpl implements IView {

	private Scanner leitor = new Scanner (System.in);
	
	@Override
	public void mostrarMenu() {
		System.out.println(MENU);
	}

	@Override
	public int capturarOpcao() {
		return leitor.nextInt();
	}

	@Override
	public void mostrarAteLogo() {
		System.out.println(ATE_LOGO);
	}

	@Override
	public void mostrarResultado(int resultado) {
		System.out.println(resultado);
		
	}

	@Override
	public void mostrarMenssagemDeErro() {
	
		System.out.println(MSG_ERRO);

	}

	
			
}
