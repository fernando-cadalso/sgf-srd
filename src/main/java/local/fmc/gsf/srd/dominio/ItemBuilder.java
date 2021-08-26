package local.fmc.gsf.srd.dominio;

import local.fmc.gsf.srd.infra.DispensaRepo;
import local.fmc.gsf.srd.infra.ListaModeloRepo;

public class ItemBuilder {

	private DispensaRepo dispensaRepo;
	private ListaModeloRepo listaModeloRepo;
	
	private ItemDeConsumo item;

	
	public ItemBuilder(DispensaRepo dispensaRepo, ListaModeloRepo listaModeloRepo) {
		this.dispensaRepo = dispensaRepo;
		this.listaModeloRepo = listaModeloRepo;
	}


	public ItemDeConsumo novoItemObrigatorio(String nome, Integer dispensaId, Integer listaId) {

		ListaModelo listaModelo = listaModeloRepo.getById(listaId);
		if (listaModelo == null) {
			throw new NullPointerException("Lista modelo informada não localizada.");
		}
		Dispensa nomeDispensa = dispensaRepo.getById(dispensaId);
		if (nomeDispensa == null) {
			throw new NullPointerException("Dispensa informada não localizada.");
		}
		this.item = new ItemDeConsumo(nome, nomeDispensa, listaModelo);
		return this.item;
	}
}
