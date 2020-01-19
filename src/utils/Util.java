package utils;
public class Util {
	
	//ex03
	public static void ex03a() {
		int a1 = (4 / 2) + (2 / 4);
		int a2 = 4 / 2 + 2 / 4;
		imprimir(3,"a",a1, a2);
	}
	public static void ex03b() {
		int a1 = 4 / (2 + 2) / 4;
		int a2 = 4 / 2 + 2 / 4;
		imprimir(3,"b",a1, a2);
	}
	public static void ex03c() {
		int a1 = (4 + 2) * 2 - 4;
		int a2 = 4 + 2 * 2 - 4;
		imprimir(3,"c",a1, a2);
	}	
	public static void imprimir (int ex,String item, int a1, int a2) {
		if(a1==a2) {
			System.out.println("ex "+ex+" item "+item+" são iguais: " +a1+ " e " +a2);
		} else {
			System.out.println("ex "+ex+" item "+item+" são diferentes: " +a1+ " e " +a2);
		}
	}
	
	public static void ex04a() {
		int a1 = 6*(3+2);
		int a2 = 6*(3+2);		
		imprimir(4,"a", a1, a2);
	}
	public static void ex04b() {
		int a1 = 2+(6*(3+2));
		int a2 = (3+2)*6 +2;		
		imprimir(4,"b", a1, a2);
	}
	public static void ex04c() {
		int a1 = 2+(3*6)/(2+4);
		int a2 = 3*6 / (2+4) +2;		
		imprimir(4,"c", a1, a2);
	}
	public static void ex04d() {
		int a1 = 2*(8/(3+1));
		int a2 = 8 / (3+1) * 2;		
		imprimir(4,"d", a1, a2);
	}
	//duvida
	public static void ex04e() {
		int a1 = 3+(16-2)/(2*(9-2));
		int a2 = 3+(16-2)/(2*(9-2));		
		imprimir(4,"e", a1, a2);
	}
	
	public static void ex04f() {
		int a1 = (6/3)+(8/2);
		int a2 = 6/3 + 8/2;		
		imprimir(4,"f", a1, a2);
	}
	
	public static void ex04g() {
		int a1 = ((3+(8/2))*4)+(3*2);
		int a2 = (3 + (8/2)) *4 + 3*2;		
		imprimir(4,"g", a1, a2);
	}
	
	public static void ex04h() {
		int a1 = (6*(3*3)+6)-10;
		int a2 = 6*3*3+6-10;		
		imprimir(4,"h", a1, a2);
	}
	
	public static void ex04i() {
		int a1 = (((10*8)+3)*9);
		int a2 = (10 * 8 + 3)*9;		
		imprimir(4,"i", a1, a2);
	}
	
	public static void ex04j() {
		int a1 = ((-12)*(-4))+(3*(-4));
		int a2 = -12 * -4 + 3 * -4;		
		imprimir(4,"j", a1, a2);
	}	
	
	public static int antecessor(int num) {
		num = num -1;
		return num;
	}
	
	public static double areaRetangulo (double base, double altura) {
		return base*altura;
	}
	
	public static int calculoIdadeDia (int dia, int mes, int ano) {
		int qtdadeDiasAno = 365;
		int qtdadeDiasMes = 30;
		int anoAtual = 2020;
		int idade = qtdadeDiasAno - (mes * qtdadeDiasMes) + dia + (anoAtual - ano)*qtdadeDiasAno;
		return idade;
	}
	
	public static String qtdadeVotos (double totalEleitores, double votosBrancos, double votosNulos, double votosValidos) {
		double brancos = (votosBrancos/totalEleitores) * 100;
		double nulos = (votosNulos/totalEleitores)*100;
		double validos = (votosValidos/totalEleitores) *100;
		System.out.println("Brancos: " +brancos+ "% , Nulos: " +nulos+ "%, Validos: " +validos+ "%");
		return null;
	}
	
	public static double calculoSalario (double salarioAtual, double percentualAjuste) {
		return salarioAtual*(1+(percentualAjuste/100));
	}
	
	public static double custoCarro (double custoFabrica) {
		double percentualDistribuidor  = 0.28;
		double impostos = 0.45;
		return custoFabrica*(1+(percentualDistribuidor+impostos));
	}
	
	public static double revendaCarro (double numCarros, double totalVendas, double salarioFixo, double comissaoCarro) {
		double percentualVendas = totalVendas * 0.05;
		double comissaoTotalCarro = numCarros*comissaoCarro;
		return salarioFixo+percentualVendas+comissaoTotalCarro;
	}
	

}
