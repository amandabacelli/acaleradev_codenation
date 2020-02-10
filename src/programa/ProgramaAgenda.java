package programa;

import java.util.Scanner;

import entities.Agenda;

public class ProgramaAgenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int resp = 0;

		while(resp!=9) {
			System.out.println("AGENDA - O que deseja fazer?\n" +
					"Opções:\n" +
					" 1 = novo cadastro\n" + 
					" 2 = listar agenda\n" + 
					" 3 = remover cadastro\n" + 
					" 4 = buscar posição do cadstro\n" + 
					" 5 = imprimir cadastro unico pela posição\n" + 
					" 9 = sair");
			resp = sc.nextInt();
			switch (resp) {
			case 1:
				System.out.println("informe os dados para inserir na agenda\n");
				System.out.println("insira o nome");
				String nome = sc.next();
				System.out.println("insira a data de nascimento");
				String dataNascimento = sc.next();
				System.out.println("insira a altura");
				String alturaString = sc.next();
				float altura = Float.parseFloat(alturaString);
				agenda.armazenarPessoa(nome, dataNascimento, altura);
				break;
			case 2:
				agenda.listarAgenda();
				break;
			case 3: 
				System.out.println("informe o nome da pessoa");
				String nomeRemove = sc.next();
				agenda.removerPessoa(nomeRemove);
				break;
			case 4:
				System.out.println("informe o nome da pessoa");
				String nomeBusca = sc.next();
				agenda.buscarPessoa(nomeBusca);
				break;
				
			default:
				break;
			}
		}


	}

}
