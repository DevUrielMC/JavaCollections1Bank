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

	//Sobreescribimos nuestros métodos hashCode y equals asignandole parametros para que no imprima objetos con valores repetidos nuestra coleccion de tipo Set  hashSet
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numCuenta == null) ? 0 : numCuenta.hashCode());
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numCuenta == null) {
			if (other.numCuenta != null)
				return false;
		} else if (!numCuenta.equals(other.numCuenta))
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
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
