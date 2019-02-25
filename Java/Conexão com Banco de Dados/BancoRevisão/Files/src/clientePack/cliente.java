package clientePack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class cliente {

	//atributos
	private int idcliente;
	private String clienteNome;
	private int clienteTel;
	
	//construtor sem parametros
	public cliente() {
	   
	}
	
	//construtor
	public cliente(int idclienteInicial, String clienteNomeInicial, int clienteTelInicial) {
		setIdcliente(idclienteInicial);
		setClienteNome(clienteNomeInicial);
		setClienteTel(clienteTelInicial);
	}
	
	//getters e setters
	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public int getClienteTel() {
		return clienteTel;
	}

	public void setClienteTel(int clienteTel) {
		this.clienteTel = clienteTel;
	}
	
	//CRUD - CREATE, READ, UPDATE, DELETE - Criar, Carregar, Atualizar, Deletar.
	
	//CREATE - Incluir
	public void incluir(Connection conn) {
		
		String sqlInsert = "INSERT INTO CLIENTE(idcliente, clienteNome, clienteTel) VALUES (?, ?, ?)";
		
		try (PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setInt(1, getIdcliente());
			stm.setString(2, getClienteNome());
			stm.setInt(3, getClienteTel());
			stm.execute();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			}
			catch (SQLException el) {
				System.out.println(el.getStackTrace());
			}
		}
	}
	


	//DELETE - Excluir
	public void excluir(Connection conn) {
		String sqlDelete = "DELETE FROM cliente WHERE id = ?";
		
		try (PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, getIdcliente());
			stm.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			}
			catch (SQLException el) {
				System.out.println(el.getStackTrace());
			}
			
		}
	}
	
	//UPDATE - Atualizar
	public void atualizar(Connection conn) {
		String sqlUpdate = "UPDATE CLIENTE SET ClienteTel = ? WHERE ID = ?";
		
		try (PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setInt(1, clienteTel);
			stm.setInt(2, getIdcliente());
			stm.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try {
			conn.rollback();
		}
		catch (SQLException el) {
			System.out.println("el.getStackTrace()");
		}
	}
	
	//READ - Consultar
	public void consultar(Connection conn) {
		String sqlSelect = "SELECT * FROM cliente WHERE cliente.id = ?";
		
		try (PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, getIdcliente());
			
			try(ResultSet rs = stm.executeQuery();) {
				
				if(rs.next()) {
					this.setClienteNome(rs.getString(2));
					this.setClienteTel(rs.getInt(3));			
				
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		catch (SQLException el) {
			System.out.println(el.getStackTrace());
		}
		
	}
	
	   // toString
	   public String toString() {
	      return "\n---------------------" +
	    		 "\nid: " + idcliente +
	             "\nNome: " + clienteNome +
	             "\nTelefone: " + clienteTel +
	             "\n---------------------";
	   }
	
}
