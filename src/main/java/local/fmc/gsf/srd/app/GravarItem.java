package local.fmc.gsf.srd.app;

import javax.validation.constraints.NotBlank;

import local.fmc.gsf.srd.dominio.ItemBuilder;
import local.fmc.gsf.srd.dominio.ItemDeConsumo;


public class GravarItem {
	
	@NotBlank(message = "Informe o nome do item.")
	private String nome;
	private String quantidade;
	private String preco;
	private String descricao;
	private String mercado;
	
	@NotBlank(message = "Selecione uma dispensa.")
	private String dispensa;
	
	@NotBlank(message = "Selecione uma lista.")
	private String lista;
	
	public ItemDeConsumo toItemDeConsumo() {
		ItemDeConsumo novoItem = new ItemBuilder().novoItemObrigatorio(nome, dispensa, lista);
		return novoItem;
	}

	public String getNome() {
		return nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public String getPreco() {
		return preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getMercado() {
		return mercado;
	}

	public String getDispensa() {
		return dispensa;
	}

	public String getLista() {
		return lista;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setMercado(String mercado) {
		this.mercado = mercado;
	}

	public void setDispensa(String dispensa) {
		this.dispensa = dispensa;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}
	
	

	
}
