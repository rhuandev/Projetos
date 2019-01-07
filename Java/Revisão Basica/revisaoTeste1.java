import javax.swing.JOptionPane;
	public class revisaoTeste1 {
		public static void main(String args[]) {
			
			int rep = 0;
			
		while(rep <= 1) {	
			
			String msg = JOptionPane.showInputDialog("Digite uma mensagem");
			int menu= Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero:" 
													+ "\n1- Printar mensagem no console" 
													+ "\n2- Mostrar uma janela com sua mensagem" 
													+ "\n3- Printar a mensagem no console + Mostrar uma janela com sua mensagem"));
			
			if(menu == 1) {	
				System.out.println(msg);
			}
			else if(menu == 2) {
				JOptionPane.showMessageDialog(null, msg);
			}
			else if(menu == 3) {
				System.out.println(msg);
				JOptionPane.showMessageDialog(null, msg);
			}
			else{
				JOptionPane.showMessageDialog(null, "Escolha uma das opções!");
			}
			
			if(menu >= 1 && menu <= 3) {
				
				int repeat= Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer novamente?"
																		+ "\n1- Sim"
																		+ "\n2- Não"));
				if(repeat == 1) {
					rep = 0;
				}
				if(repeat == 2) {
					break;
				}
			}
		}
	}
}
		