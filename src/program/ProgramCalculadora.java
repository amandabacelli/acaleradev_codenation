package program;

import java.util.Scanner;

import utils.CalculadoraSalario;
import utils.Util;

public class ProgramCalculadora {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("insira o salario bruto: ");
		double salarioBruto = ler.nextDouble();
		double teste = CalculadoraSalario.calcularSalarioLiquido(salarioBruto);
		System.out.print(teste);
	}

}
