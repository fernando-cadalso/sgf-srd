package local.fmc.gsf.srd.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ListaModelo {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "lista")
	private List<ItemDeConsumo> itens;

	public void setItens(List<ItemDeConsumo> itens) {
		this.itens = itens;
	}

	public String getNome() {
		return nome;
	}

	public List<ItemDeConsumo> getItens() {
		return itens;
	}

	public void setNome(String nome) {
this.nome = nome;	
	}
}
