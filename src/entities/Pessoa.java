package entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private float altura;
	
	public Pessoa(String nome, String dataNascimento, float altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}

	public Pessoa() {
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	//transformar a string em data no formato que eu quero
	public int calcularIdade () {
		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFormatada = LocalDate.parse(this.dataNascimento,formatarData);
		//comparar o ano entre a data do sistema
		int idade = Period.between(dataFormatada, LocalDate.now()).getYears();
		return idade;
	}
	
	public String toString() {
		return "Nome: "+ nome + ", " + "data de nascimento: " + dataNascimento + ", altura: " + String.format("%.2f", altura)+ ", ";
	
	}

}
