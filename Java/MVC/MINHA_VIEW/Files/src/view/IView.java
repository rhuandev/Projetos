package view;

public interface IView {
	
	public final static String MENU = "\n1- Castar Magia \n2- Checar Mana \n3- Beber Poção de MANA \n4- Cometer Suicidio";
	public final static String SUICIDIO = "Você Morreu!\n";
	public final static String MSG_ERRO = "Escolha uma opção correta!";
	
	public void mostrarMenu();
	public int capturarOpcao();
	
	public abstract void mostrarResultado(int resultado);
	
	public void mostrarSuicidio();
	public void mostrarMenssagemDeErro();
	
	
	
}
