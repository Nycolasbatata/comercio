package com.itb.inf2dm.comercio.model;

public class Produto {
	private long id;
	private String descricao;
	private String nome;
	private String codigoBarras;
	private double preco;
	
	//public: modificador de acesso livre para todas as classes
	//private: Modificador de acesso restrito apenas membros 
	//da própia classe, Entende-se por "membros" (atributos e/ou metodos).
	
	//Métodos setter's e Getter's: Adicionar e recuperar dados do atributo "RESPECTIVAMENTE"
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;

}
	public String getDescricao() {
		return descricao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
		
	}
	 public double getPreco() {
		 return preco;
	 }
}
