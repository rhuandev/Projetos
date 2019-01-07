public class Celular {
	
	//atributos
	private String marca;
	private String modelo;
	private String cor;
	private int memoria;
	
	//construtor
	public Celular (String marcaInicial, String modeloInicial, String corInicial, int memoriaInicial) {
		marca = marcaInicial;
		modelo = modeloInicial;
		cor = corInicial;
		memoria = memoriaInicial;
	}
	
	//metodos
	public void ligar(boolean ligado) {
		ligado = true;
	}
	
	public void desligar(boolean ligado) {
		ligado = false;
	}

	//getters e setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	//metodo main
	public static void main(String args[]) {
		
		//objeto 1
		Celular celular1 = new Celular("Samsung Galaxy", "S9", "Preto", 64);
		System.out.println("Celular:"
							+ "\nMarca: "+celular1.getMarca()
							+ "\nModelo: "+ celular1.getModelo()
							+ "\nCor: "+celular1.getCor()
							+ "\nMemoria: "+celular1.getMemoria() + "gb");
		
		//objeto 2
		Celular celular2 = new Celular("Iphone", "7", "Branco", 32);
		System.out.println("\nCelular:"
							+ "\nMarca: "+celular2.getMarca()
							+ "\nModelo: "+ celular2.getModelo()
							+ "\nCor: "+celular2.getCor()
							+ "\nMemoria: "+celular2.getMemoria() + "gb");
		
	}
	
}
