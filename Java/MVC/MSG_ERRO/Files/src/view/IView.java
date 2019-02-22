package view;

public interface IView {
	
	public final static String MENU = "1- Incrementar \n2- Decrementar \n3- Sair";
	public final static String ATE_LOGO = "Ate logo!\n";
	public final static String MSG_ERRO = "Opcao Invalida!";
	
	public void mostrarMenu();
	public int capturarOpcao();
	
	public abstract void mostrarResultado(int resultado);
	
	public void mostrarAteLogo();
	public void mostrarMenssagemDeErro();
	
	
	
}
