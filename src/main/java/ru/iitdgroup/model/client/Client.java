package ru.iitdgroup.model.client;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;


import ru.iitdgroup.model.BaseBOMEntityWithSurrogate;
import ru.iitdgroup.model.BusinessKey;
import ru.iitdgroup.model.client.phone.ClientPhone;



@Entity(name = "Client")
@Table(name = "CLIENT")
public class Client extends BaseBOMEntityWithSurrogate implements BusinessKey  {

	private static final long serialVersionUID = 1L;

	@Column(name = "CLIENT_UID", length = 50)
	@NaturalId
	private String clientUid;
	@OneToMany(mappedBy = "", orphanRemoval = false, fetch = FetchType.LAZY)
	private List<ClientPhone> clientPhones;

	public String getClientUid() {
		return clientUid;
	}

	public void setClientUid(String clientUid) {
		this.clientUid = clientUid;
	}

	public List<ClientPhone> getClientPhones() {
		return clientPhones;
	}

	public void setClientPhones(List<ClientPhone> clientPhones) {
		this.clientPhones = clientPhones;
	}

	@Override
	public Object getObjectKey() {
		
		return this.clientUid;
	}

	@Override
	public String getStringKey() {
		
		return this.clientUid;
	}

}
