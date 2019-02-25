package testePack;

import java.sql.Connection;
import java.sql.SQLException;

import clientePack.cliente;
import conexaoBDPack.ConexaoBD;
import vendedorPack.Vendedor;

public class Teste {

	public static void main(String[] args) {
		
		Connection conn = null;
		cliente cl;
		Vendedor vd;
		
		try { 
		ConexaoBD bd = new ConexaoBD();
		conn = bd.conectar();
		vd   = new Vendedor();
		
		// *** IMPORTANTE ***: Força o uso de transação.
		conn.setAutoCommit(false);
		
		//Primeiro cliente
		cl = new cliente(0001, "Testudo Testando", 1112344321);
		cl.incluir(conn);
		
		//Segundo Cliente
		cl = new cliente();
		cl.setIdcliente(0002);
		cl.setClienteNome("Testoso Testando");
		cl.setClienteTel(1143211234);
		cl.incluir(conn);
		
		//Terceiro Cliente
		cl = new cliente();
		cl.setIdcliente(0003);
		cl.setClienteNome("Testoroso Testão");
		cl.setClienteTel(1112388321);
		cl.incluir(conn);
		
		conn.commit();
		
        System.out.println("\nLista todos os clientes:");
        vd.listarClientes(conn);
		} 
	    catch (Exception e) {
	       e.printStackTrace();
	       if (conn != null) {
	          try {
	             conn.rollback();
	          } 
	          catch (SQLException e1) {
	             System.out.print(e1.getStackTrace());
	          }
	       }
	    } 
	    finally {
	       if (conn != null) {
	          try {
	             conn.close();
	          } 
	          catch (SQLException e1) {
	             System.out.print(e1.getStackTrace());
	          }
	       }
	    }	
	}
}
