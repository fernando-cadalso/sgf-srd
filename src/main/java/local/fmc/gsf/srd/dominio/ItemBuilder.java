package local.fmc.gsf.srd.dominio;

import org.springframework.beans.factory.annotation.Autowired;

import local.fmc.gsf.srd.infra.DispensaRepo;
import local.fmc.gsf.srd.infra.ItemDeConsumoRepo;
import local.fmc.gsf.srd.infra.ListaModeloRepo;

public class ItemBuilder {

	@Autowired
	private DispensaRepo dispensaRepo;

	@Autowired
	private ListaModeloRepo ListaModeloRepo;
	private ItemDeConsumo item;

	public ItemDeConsumo novoItemObrigatorio(String nome, String dispensa, String lista) {

		ListaModelo listaModelo = ListaModeloRepo.findByNomeLike(lista);
		if (listaModelo == null) {
			throw new NullPointerException("Lista modelo informada não localizada.");
		}
		Dispensa nomeDispensa = dispensaRepo.findByNomeLike(dispensa);
		if (nomeDispensa == null) {
			throw new NullPointerException("Dispensa informada não localizada.");
		}
		this.item = new ItemDeConsumo(nome, nomeDispensa, listaModelo);
		return this.item;
	}
}
