package ar.edu.unlam.basica2;

import java.util.TreeSet;

public class bar {
	
	public class Cliente {


	private TreeSet<Cliente> clientes;
	
	public void bar(){
		clientes = new TreeSet <Cliente>();
		
	}
	
	public TreeSet<Cliente> getClientes() {
		return clientes;
	}
	
	
	public void setClientes(TreeSet<Cliente> clientes){
		
		this.clientes=clientes;
	}
	
	public void agregarCliente(Cliente cliente){
		if(cliente!= null){
		clientes.add(cliente);
		}
		
	}

}

	}
