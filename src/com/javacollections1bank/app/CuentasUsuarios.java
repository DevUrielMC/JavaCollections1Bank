package com.javacollections1bank.app;

import java.util.HashSet;
import java.util.Set;

import com.javacollections1bank.model.Cliente;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// Creación de cuatro métodos de tipo cliente
		Cliente clt1= new Cliente ("Uriel","2373624621",30000.00);
		Cliente clt2 = new Cliente ("Valeria","35465654464",35451.00);
		Cliente clt3 = new Cliente ("Hugo","654121323125",654841513.00);
		Cliente clt4 = new Cliente ("Tomasa","645414535885",989654631313.00);
		Cliente clt5 = new Cliente ("Tomasa","645414535885",989654631313.00);
		//Creamos una colección de tipo HashSet para agregar clientes
		Set<Cliente> clientesBanco= new HashSet<Cliente>();
		
		//Añadimos los objetos de tipo Cliente a nuestra colección  clientesBanco
		clientesBanco.add(clt1);
		clientesBanco.add(clt2);
		clientesBanco.add(clt3);
		clientesBanco.add(clt4);
		clientesBanco.add(clt5);
		
		//Implementamos un For-Each para recorrer todos los elementos de tipo Cliente, dentro de la coleccion clientesBanco
		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre()+ " "+ cliente.getNumCuenta()+ " "+ cliente.getSaldo());
		}
	}

}
