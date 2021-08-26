package local.fmc.gsf.srd.dominio;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ItemDeConsumo extends ItemDaCasa {

	private Double quantidade;
	private BigDecimal preco;
	private String descricao;
	private String mercado;

	@OneToOne
	private Dispensa dispensa;
	
	@ManyToOne
	private ListaModelo lista;

	public ItemDeConsumo() {
	}

	public ItemDeConsumo(String nome, Dispensa dispensa, ListaModelo listaModelo) {
		super(nome);
		this.dispensa = dispensa;
		this.lista = listaModelo;
	}
	
	public ItemDeConsumo(String nome, Double quantidade, Dispensa dispensa, ListaModelo listaModelo) {
		super(nome);
		this.quantidade = quantidade;
		this.dispensa = dispensa;
		this.lista = listaModelo;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public Dispensa getDispensa() {
		return dispensa;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public ListaModelo getLista() {
		return lista;
	}
	
	public String getMercado() {
		return mercado;
	}
	
	public void setMercado(String mercado) {
		this.mercado = mercado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
