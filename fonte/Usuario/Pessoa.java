package com.ti2cc;

public class Pessoa {
    private int id;
	private String nome;
    private String email;
	private String login;
	private String senha;
	
	public Pessoa() {
        this.id = ;//FUNÇÃO PARA FAZER O ID
        this.nome = "";
		this.email = "";
		this.login = "";
		this.senha = "";
	}
	
	public Pessoa(String nome, String email, String login, String senha) {
        this.id = ;//FUNÇÃO PARA FAZER O ID
		this.nome = codigo;
        this.email = email;
		this.login = login;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId() {
	
    
        //AKI FUNCAO PARA FAZER ID
	
    }

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", senha=" + senha + 
        ", nome=" + nome + ", email=" + email +"]";
	}
	
}