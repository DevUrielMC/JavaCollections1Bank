package com.javacollections1bank.model;

public class Cliente {

	//Declaración de Variables
	private String nombre;
	private String numCuenta;		//Tipo String ya que no se van a efectuar operaciones matemáticas con esta variable
	private double saldo;
	
	
	//Constructor parametrizado
	public Cliente(String nombre, String numCuenta, double saldo) {
		this.nombre=nombre;
		this.numCuenta=numCuenta;
		this.saldo= saldo;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
