package aaaaa;

public class Classe1 {
	static String modelo;
	String cor;
	float valor;
	
	public Classe1() {
		modelo = "bonito";
		cor = "indefinida";
	}
	
	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public static void main(String[] args) {
		try {
			System.out.println("Detalhes: "+modelo);
		} catch (Exception e) {
			System.out.println("não foi possível imprimir detalhes");
		}
	}
}
