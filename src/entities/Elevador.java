package entities;

public class Elevador {
	
	private int andarAtual;
	private int pessoas;
	
	int[] capacidadePessoas = new int[15];
	int[] totalAndare = new int[10];
	
	public Elevador(int andarAtual, int pessoas) {
		this.andarAtual = andarAtual;
		this.pessoas = pessoas;
	}
	

	public Elevador() {
		super();
	}


	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}
	
	

	}
	
	

