package local.fmc.gsf.srd.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Dispensa extends ItemDaCasa{
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dispensa")
	private List<ItemDeConsumo> itens = new ArrayList<>();
	
	public Dispensa() {
	}
	public Dispensa(String nome) {
		super(nome);
	}

	public void adicionaItem(ItemDeConsumo item){
		this.itens.add(item);
	}
}
