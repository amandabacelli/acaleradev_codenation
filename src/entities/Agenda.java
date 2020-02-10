package entities;

import java.util.Scanner;

public class Agenda extends Pessoa {

	// toda vez que usar a herança tem que criar um construtor com super
	Scanner sc = new Scanner(System.in);

	public Agenda(String nome, String dataNascimento, float altura) {
		super(nome, dataNascimento, altura);
	}

	public Agenda() {
		// TODO Auto-generated constructor stub
	}

	Pessoa[] agenda = new Pessoa[10];

	public void armazenarPessoa(String nome, String dataNascimento, float altura) {
		Pessoa pessoa = new Pessoa(nome, dataNascimento, altura);
		for (int i = 0; i <= agenda.length; i++) {
			try {
				if (agenda[i] == null) {
					agenda[i] = pessoa;
					break;
				}
			} catch (Exception e) {
				System.out.println("Sem espaço na agenda");
			}
		}
	}

	public void listarAgenda() {
		for (Pessoa check : agenda) {
			if(check!=null) {
				System.out.println(check);
			} else {
				System.out.println("Livre");
			}
		}
	}

	public void removerPessoa(String nome) {
		for(Pessoa verificar : agenda) {
			if(verificar.getNome() == nome) {
				verificar = null;
			}
		}
	}
		
//	public void removerPessoa(String nome) {
//		for (int i = 0; i <= agenda.length; i++) {
//			if (agenda[i].getNome() != null && nome.equals(agenda[i].getNome())) {
//				agenda[i] = null;
//			}
//		}
//	}

	public int buscarPessoa(String nome) {
		int index = 0;
		for (int i = 0; i <= agenda.length; i++) {
			if (nome == this.agenda[i].getNome()) {
				index = i;
			} else {
				System.out.println("pessoa não encontrada");
			}
		}
		return index;
	}


}
