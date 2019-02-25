package vendedorPack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import clientePack.cliente;
public class Vendedor {
   // listarClientes
   public void listarClientes(Connection conn) {
      ArrayList<cliente> lista = buscarClientes(conn);
      for (cliente cliente:lista) {
         System.out.println(cliente);
      }
   }
   // buscarCliente
	public ArrayList<cliente> buscarClientes(Connection conn) {
		
		String sqlSelect = "SELECT idcliente, clienteNome, clienteTel FROM CLIENTE";
		ArrayList<cliente> listaCliente = new ArrayList<>();
		
		try(PreparedStatement stm = conn.prepareStatement(sqlSelect);
			ResultSet rs = stm.executeQuery();) {
			
			while(rs.next()) {
				cliente cliente = new cliente();
				cliente.setIdcliente(rs.getInt("idcliente"));
				cliente.setClienteNome(rs.getString("clienteNome"));
				cliente.setClienteTel(rs.getInt("clienteTel"));
				listaCliente.add(cliente);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	return listaCliente;	
	}
}