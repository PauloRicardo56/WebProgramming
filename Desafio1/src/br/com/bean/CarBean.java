package br.com.bean;

public class CarBean {
	private String id;
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean disponivel;
	
	public CarBean(String f, String m, int a, boolean d) {
		setFabricante(f);
		setModelo(m);
		setAno(a);
		setDisponivel(d);
	}
	
	public CarBean(String f, String m, int a, boolean d, String id) {
		this(f, m, a, d);
		setID(id);
	}

	// Gets & Sets
	public String getID() {
		return id;
	}
	
	private void setID(String id) {
		this.id = id;
	}
	
	public String getFabricante() {
		return fabricante;
	}

	private void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	private void setAno(int ano) {
		this.ano = ano;
	}

	public int getDisponivel() {
		return disponivel ? 1 : 0;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
