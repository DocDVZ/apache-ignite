package ru.iitdgroup.model.receiver;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


import ru.iitdgroup.model.BaseBOMEntityWithSurrogate;
import ru.iitdgroup.model.BusinessKey;



@Entity(name = "Receiver")
@Table(name = "Receiver")

@DiscriminatorColumn(name = "object_type", length = 255, discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Receiver extends BaseBOMEntityWithSurrogate implements BusinessKey {

	private static final long serialVersionUID = 1L;

}
