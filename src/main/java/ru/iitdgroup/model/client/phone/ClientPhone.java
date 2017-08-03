package ru.iitdgroup.model.client.phone;

import ru.iitdgroup.model.BaseBOMEntityWithSurrogate;
import ru.iitdgroup.model.BusinessKey;
import ru.iitdgroup.model.PhoneNumber;

import javax.persistence.*;



@Entity(name = "ClientPhone")
@Table(name = "CLIENT_PHONE")
public class ClientPhone extends BaseBOMEntityWithSurrogate implements BusinessKey {

	private static final long serialVersionUID = 1L;
	@JoinColumn(name = "NUMBER_FK")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private PhoneNumber number;
	@JoinColumn(name = "PHONE_TYPE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private PhoneType phoneType;
	@JoinColumn(name = "PHONE_STATUS_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private PhoneStatus phoneStatus;

	public PhoneNumber getNumber() {
		return number;
	}

	public void setNumber(PhoneNumber number) {
		this.number = number;
	}

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

	@Override
	public Object getObjectKey() {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public String getStringKey() {
		
		throw new UnsupportedOperationException();
	
		
	}

	public PhoneStatus getPhoneStatus() {
		return phoneStatus;
	}

	public void setPhoneStatus(PhoneStatus phoneStatus) {
		this.phoneStatus = phoneStatus;
	}

}
