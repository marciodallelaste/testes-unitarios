package br.com.app.data;

public class participant {

	private String name;
	private String lastName;
	private int year;
	private int weight;
	private int altura;
	
	
//Nome
	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

//last Name
	public String getLastName() {
		return lastName;
	}
	
	
	public void setLastName(String sobrenome) {
		this.lastName = sobrenome;
	}	
	
//idade	
	public int getIdade() {
		return year;
	}

	public void setIdade(int idade) {
		this.year = idade;
	}

// Peso
	public void setWeight(int pWeight) {
		this.weight = pWeight;
		
	}

	public Object getWeight() {
		return weight;
	}
	
//Altura
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public Object getAltura() {
		return altura;
	}
}