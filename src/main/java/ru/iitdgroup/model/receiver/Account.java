package ru.iitdgroup.model.receiver;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@DiscriminatorValue("Account")
@Entity(name = "Account")
public class Account extends Receiver  {

	private static final long serialVersionUID = 1L;

	@Column(name = "BIC", length = 9)
	private String bic;

	@Column(name = "ACCOUNT", length = 20)
	private String account;

	@Override
	public Object getObjectKey() {
		
		return "A"+bic+":"+account;
	}

	@Override
	public String getStringKey() {

		return "A"+bic+":"+account;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
