package br.com.codenation.calculadora;

public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		return Math.round(calcularIr(calcularInss(salarioBase)));
	}

	public double calcularIr(double salarioBase) {
		if (salarioBase <=3000) {
			return salarioBase;	
		} else if (salarioBase <= 6000) {
			return salarioBase-=salarioBase * 0.075;
		} else {
			return salarioBase-=salarioBase * 0.15;
		}
	}
	
	private double calcularInss(double salarioBase) {
		if (salarioBase < 1039) {
			return 0.0;
		} else if (salarioBase <= 1500) {
			return salarioBase-=salarioBase * 0.08;
		} else if (salarioBase <=4000) {
			return salarioBase-=salarioBase * 0.09;
		} else {
			return salarioBase-=salarioBase * 0.11;
		}
	}
	public static void main(String[] args) {
		CalculadoraSalario app = new CalculadoraSalario();
		System.out.println(app.calcularSalarioLiquido(4000.01));	
	}
}