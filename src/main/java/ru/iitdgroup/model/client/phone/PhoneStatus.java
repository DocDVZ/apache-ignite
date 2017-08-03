package ru.iitdgroup.model.client.phone;

import javax.persistence.Entity;
import javax.persistence.Table;


import ru.iitdgroup.model.BaseNamedEntity;



@Entity(name = "PhoneStatus")
@Table(name = "PHONE_STATUS")
public class PhoneStatus extends BaseNamedEntity {


	private static final long serialVersionUID = 6617294949478625075L;

}
