package local.fmc.gsf.srd.dominio;

public class Morador {

	private String nome;
	private String papel;
	private String usuario;
	private String senha;

	public Morador() {
	}

	public Morador(String nome, String usuario, String papel) {
		this.nome = nome;
		this.usuario = usuario;
		this.papel = papel;
	}

	public String getNome() {
		return nome;
	}
	
	public String getPapel() {
		return papel;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void criarSenha(String senha) {
		this.senha = senha;
	}
}
