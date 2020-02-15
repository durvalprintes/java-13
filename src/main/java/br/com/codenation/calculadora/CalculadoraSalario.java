package br.com.codenation.calculadora;

public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBase) {
		double salarioFinal = calcularInss(salarioBase);
		if (salarioFinal <=3000) {
			return Math.round(salarioFinal);	
		} else if (salarioFinal <= 6000) {
			return Math.round(salarioFinal-=salarioFinal * 0.075);
		} else {
			return Math.round(salarioFinal-=salarioFinal * 0.15);
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