package ru.iitdgroup.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.NaturalId;


@MappedSuperclass
public abstract class BaseNamedEntity extends BaseBOMEntityWithSurrogate  implements BusinessKey {

	private static final long serialVersionUID = 1L;

	@Column(name = "MNEMONICS", length = 20)
	@NaturalId
	private String mnemonics;

	@Column(name = "NAME", length = 255)
	private String name;

	public String getMnemonics() {
		return mnemonics;
	}

	public void setMnemonics(String mnemonics) {
		this.mnemonics = mnemonics;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Object getObjectKey() {
		
		return this.mnemonics;
	}
	
	@Override
	public String getStringKey() {
		
		return this.mnemonics;
	}

}
