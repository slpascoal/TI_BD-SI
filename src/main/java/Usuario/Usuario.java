import java.util.Random;

public class Usuario {
	private String login;
	private String senha;
	Random geradorId = new Random();
	
	public Usuario() {
		this.login = "";
		this.senha = "";
	}
	
	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
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

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + "]";
	}
	
}
