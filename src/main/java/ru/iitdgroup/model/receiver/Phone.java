package ru.iitdgroup.model.receiver;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ru.iitdgroup.model.PhoneNumber;



@Entity(name = "Phone")
public class Phone extends Receiver  {

	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "PHONE_NUMBER_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private PhoneNumber phoneNumber;

	@Override
	public Object getObjectKey() {

		return this.phoneNumber;
	}

	@Override
	public String getStringKey() {

		return "P"+phoneNumber.getStringKey();
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
