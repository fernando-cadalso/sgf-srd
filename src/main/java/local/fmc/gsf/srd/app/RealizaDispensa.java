package local.fmc.gsf.srd.app;

import local.fmc.gsf.srd.dominio.Dispensa;

public class RealizaDispensa {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Dispensa toDispensa() {
		
		Dispensa novaDispensa = new Dispensa(this.nome);
		return novaDispensa;
	}
}
