package utils;

public class CalculadoraSalario {
		
	public static double calcularSalarioLiquido (double salarioBruto) {
		double salarioBrutoINSS = calcularINSS(salarioBruto);
		double salarioLiquido = 0.0;
		if(salarioBrutoINSS > 3000 && salarioBrutoINSS < 6000 ) {
			salarioLiquido = salarioBrutoINSS *(1-0.075);
		} else if(salarioBrutoINSS >= 6000) {
			salarioLiquido = salarioBrutoINSS * (1-0.15);
		}else {
			salarioLiquido = salarioBrutoINSS;
		}
		return Math.round(salarioLiquido);
	}
	public static double calcularINSS(double salarioBruto) {
		double salarioINSS = 0.0;
		if (salarioBruto >= 1032 && salarioBruto <= 1500) {
			salarioINSS = salarioBruto * (1 - 0.08);
		} else if (salarioBruto > 1500 && salarioBruto <= 4000) {
			salarioINSS = salarioBruto * (1 - 0.09);
		} else if (salarioBruto > 4000){
			salarioINSS = salarioBruto * (1 - 0.11);
		} else if (salarioBruto < 1031) {
			salarioINSS = 0.0;
		}
		return salarioINSS;
	}

}
