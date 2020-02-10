package programa;

import entities.Pessoa;

public class ProgramaIdade {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Amanda", "20/06/1990", (float) 1.75);
		System.out.println(pessoa + "idade: " + pessoa.calcularIdade());
		
	}

}
