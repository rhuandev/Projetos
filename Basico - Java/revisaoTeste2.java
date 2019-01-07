//Ler varios numeros e informar quantos numeros entre 100 e 200 foram digitados. Quando o valor 0 (zero) for lido o algoritimo deverá cessar sua execução.

import javax.swing.JOptionPane;
	public class revisaoTeste2 {
		public static void main(String args[]) {
			
			int cont = 0;
			int num = 0;
			
			do {
			
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
				
				if(num >= 100 && num <= 200) {
					cont++;
					System.out.println(num);
				}
				else if(num == 0) {
					break;
				}
				else {
					System.out.println("O numero " + num + " não está entre 100 e 200.");
				}
				
			}while(num != 0); 
			
			System.out.println("Foram digitados " + cont + " numeros entre 100 e 200.");
			
		}
}
