package local.fmc.gsf.srd.app;

import local.fmc.gsf.srd.dominio.ListaModelo;

public class ListaModeloBuilder {

	private ListaModelo lista;

	public ListaModeloBuilder comNome(String nome) {
		this.lista = new ListaModelo();
		this.lista.setNome(nome);
		return this;
	}
	
	public ListaModelo criar() {
		return this.lista;
	}
}
