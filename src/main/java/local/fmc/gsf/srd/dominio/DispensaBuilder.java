package local.fmc.gsf.srd.dominio;

public class DispensaBuilder {

	private Dispensa dispensa;
	
	public DispensaBuilder novaDispensa(String nome) {
		
		this.dispensa = new Dispensa(nome);
		return this;
	}
	
	public Dispensa criar() {
		return this.dispensa;
	}
}
