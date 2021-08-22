package local.fmc.gsf.srd.dominio;

public class MoradorBuilder {
	private Morador morador;

	public MoradorBuilder cadNomeUsuario(String nome, String usuario, String papel) {
		Morador novoMorador = new Morador(nome, usuario, papel);

		return this;
	}

	public MoradorBuilder cadSenha(String senha) {
		morador.criarSenha(senha);

		return this;
	}

	public Morador criar() {
		return this.morador;
	}
}
