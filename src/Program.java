import java.util.Scanner;

import utils.Util;

public class Program {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		// ex03
		Util.ex03a();
		System.out.println("=======================================");
		Util.ex03b();
		System.out.println("=======================================");
		Util.ex03c();
		System.out.println("=======================================");

		// ex04
		Util.ex04a();
		System.out.println("=======================================");
		Util.ex04b();
		System.out.println("=======================================");
		Util.ex04c();
		System.out.println("=======================================");
		Util.ex04d();
		System.out.println("=======================================");
		Util.ex04e();
		System.out.println("=======================================");
		Util.ex04f();
		System.out.println("=======================================");
		Util.ex04g();
		System.out.println("=======================================");
		Util.ex04h();
		System.out.println("=======================================");
		Util.ex04i();
		System.out.println("=======================================");
		Util.ex04j();
		System.out.println("=======================================");

		// ex05
		System.out.println("ex 5 - insira um numero para verificar seu antecessor: ");
		int numero = ler.nextInt();
		int antecessor = Util.antecessor(numero);
		System.out.printf("antecessor é: " + antecessor);
		System.out.println();
		System.out.println("=======================================");

		// ex06
		System.out.println("ex 6 - insira o valor da BASE do retangulo: ");
		double base = ler.nextDouble();
		System.out.println("insira o valor da ALTURA do retangulo: ");
		double altura = ler.nextDouble();
		double area = Util.areaRetangulo(base, altura);
		System.out.printf("a area do retanguo é %.2f%n", area);
		System.out.println();
		System.out.println("=======================================");

		// ex07
		System.out.println("ex 7 - insira o dia de seu nascimento: ");
		int dia = ler.nextInt();
		System.out.println("insira o mes de nascimento: ");
		int mes = ler.nextInt();
		System.out.println("insira o ano de nascimento com 4 digitos: ");
		int ano = ler.nextInt();
		int idade = Util.calculoIdadeDia(dia, mes, ano);
		System.out.printf("a idade em dias é " + idade);
		System.out.println();
		System.out.println("=======================================");
		
		//ex08
		System.out.println("ex 8 - insira o total de eleitores: ");
		double eleitores = ler.nextDouble();
		System.out.println("insira o total de votos brancos: ");
		double brancos = ler.nextDouble();
		System.out.println("insira o total de votos nulos: ");
		double nulos = ler.nextDouble();
		System.out.println("insira o total de votos validos: ");
		double validos = ler.nextDouble();
		String porcentagem = Util.qtdadeVotos(eleitores, brancos, nulos, validos);
		System.out.println();
		System.out.println("=======================================");
		
		//ex09
		System.out.println("ex 9 - insira o salario atual: ");
		double salarioAtual = ler.nextDouble();
		System.out.println("insira o percentual de ajuste: ");
		double percentualAjuste = ler.nextDouble();
		double ajuste = Util.calculoSalario(salarioAtual, percentualAjuste);
		System.out.printf("o salario ajustado é $ %.2f%n", ajuste);
		System.out.println();
		System.out.println("=======================================");
		
		//ex10
		System.out.println("ex 10 - insira o custo de fabrica do carro: ");
		double custoFabrica = ler.nextDouble();
		double custoFinal = Util.custoCarro(custoFabrica);
		System.out.printf("o custo final ao consumidor é $ %.2f%n", custoFinal);
		System.out.println();
		System.out.println("=======================================");
		
		//ex11
		System.out.println("ex 11 - insira a quantidade de carros vendidos: ");
		double numCarros = ler.nextDouble();
		System.out.println("insira o valor total de vendas: ");
		double totalVendas = ler.nextDouble();
		System.out.println("insira o salario fixo: ");
		double salarioFixo = ler.nextDouble();
		System.out.println("insira a comissao por carro vendido: ");
		double comissaoCarro = ler.nextDouble();
		double salarioFinal = Util.revendaCarro(numCarros, totalVendas, salarioFixo, comissaoCarro);
		System.out.printf("o salario final do vendendor é $ %.2f%n", salarioFinal);
		System.out.println();
		System.out.println("=======================================");
		
			
	}

}
