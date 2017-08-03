package ru.iitdgroup.model.client.phone;

import javax.persistence.Entity;
import javax.persistence.Table;



import ru.iitdgroup.model.BaseNamedEntity;




@Entity(name = "PhoneType")
@Table(name = "PHONE_TYPE")
public class PhoneType extends BaseNamedEntity  {

	private static final long serialVersionUID = 1L;

}
