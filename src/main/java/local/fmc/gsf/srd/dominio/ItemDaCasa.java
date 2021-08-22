package local.fmc.gsf.srd.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ItemDaCasa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String nome;

	public ItemDaCasa(String nome) {
		this.nome = nome;
	}

	public ItemDaCasa() {}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
}
