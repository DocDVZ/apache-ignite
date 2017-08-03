package ru.iitdgroup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity(name = "PhoneNumber")
@Table(name = "PHONE_NUMBER")
public class PhoneNumber extends BaseBOMEntityWithSurrogate implements BusinessKey {

	private static final long serialVersionUID = 1L;

	@Column(name = "NUMBER_COL", length = 20)
	@NaturalId
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public Object getObjectKey() {

		return this.number;
	}

	@Override
	public String getStringKey() {

		return this.number;
	}

}
