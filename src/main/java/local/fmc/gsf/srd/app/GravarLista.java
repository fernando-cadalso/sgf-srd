package local.fmc.gsf.srd.app;

import javax.validation.constraints.NotBlank;

import local.fmc.gsf.srd.dominio.ListaModelo;

public class GravarLista {

	@NotBlank(message = "Informe o nome da lista.")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ListaModelo toListaModelo() {
		ListaModelo novaLista = new ListaModeloBuilder().comNome(nome).criar();
		return novaLista;
	}
}
