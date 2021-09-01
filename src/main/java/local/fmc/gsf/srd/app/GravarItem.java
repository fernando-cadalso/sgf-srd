package local.fmc.gsf.srd.app;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import local.fmc.gsf.srd.dominio.ItemBuilder;
import local.fmc.gsf.srd.dominio.ItemDeConsumo;
import local.fmc.gsf.srd.infra.DispensaRepo;
import local.fmc.gsf.srd.infra.ListaModeloRepo;

public class GravarItem {

	@NotNull
	@Length(min = 2)
	@NotBlank(message = "Nome deve ter 2 caracteres, no mínimo.")
	private String nome;
	private String quantidade;
	private String preco;
	private String descricao;
	private String mercado;

	@NotBlank(message = "Selecione uma dispensa.")
	private String dispensaId;

	@NotBlank(message = "Selecione uma lista.")
	private String listaId;
	
	private ItemBuilder itemBuilder;
	
	public GravarItem(ItemBuilder itemBuilder) {
		this.itemBuilder = itemBuilder;
	}

//	public ItemDeConsumo toItemDeConsumo(DispensaRepo dispensaRepo) {
//		ItemDeConsumo novoItem = itemBuilder.novoItemObrigatorio(nome, 
//				Integer.valueOf(this.dispensaId), Integer.valueOf(this.listaId));
//		return novoItem;
//	}
	
	public ItemDeConsumo toItemDeConsumo(DispensaRepo dispensaRepo, ListaModeloRepo listaModeloRepo) {
		ItemDeConsumo novoItem = new ItemBuilder(dispensaRepo, listaModeloRepo).novoItemObrigatorio(nome, 
				Integer.valueOf(this.dispensaId), Integer.valueOf(this.listaId));
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

	public String getDispensaId() {
		return dispensaId;
	}

	public String getListaId() {
		return listaId;
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

	public void setDispensaId(String dispensa) {
		this.dispensaId = dispensa;
	}

	public void setListaId(String lista) {
		this.listaId = lista;
	}

}
