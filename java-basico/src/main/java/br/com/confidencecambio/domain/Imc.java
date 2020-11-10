package br.com.confidencecambio.domain;

import java.io.Serializable;

public class Imc implements Serializable{

	private double altura;
	private double peso;
	private double imc;
	
	
	
	
	public Imc(double altura, double peso,double imc) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.imc= imc;
		
	}
	
	
	public Imc() {
		super();
		// TODO Auto-generated constructor stub
	}


	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	
	


}
