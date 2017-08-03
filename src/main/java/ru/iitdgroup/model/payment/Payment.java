package ru.iitdgroup.model.payment;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.math.BigDecimal;
import javax.persistence.Column;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;

import ru.iitdgroup.model.BaseBOMEntityWithSurrogate;
import ru.iitdgroup.model.BusinessKey;
import ru.iitdgroup.model.client.Client;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import ru.iitdgroup.model.receiver.Receiver;



@Entity(name = "Payment")
@Table(name = "PAYMENT")
public class Payment extends BaseBOMEntityWithSurrogate implements BusinessKey  {

	private static final long serialVersionUID = 1L;
	@Column(name = "AMOUNT")
	private BigDecimal amount;
	@Column(name = "BALANCE")
	private BigDecimal balance;
	@Column(name = "BORN_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date bornDate;
	@JoinColumn(name = "SOURCE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Client source;
	@JoinColumn(name = "DESTINATION_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Receiver destination;
	@Column(length = 50, name = "TRANS_ID")
	private String transId;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

	public Client getSource() {
		return source;
	}

	public void setSource(Client source) {
		this.source = source;
	}

	public Receiver getDestination() {
		return destination;
	}

	public void setDestination(Receiver destination) {
		this.destination = destination;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	@Override
	public Object getObjectKey() {
		
		return this.transId;
	}

	@Override
	public String getStringKey() {

		return this.transId;
	}

}
