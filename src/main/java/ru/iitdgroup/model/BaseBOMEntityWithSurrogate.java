package ru.iitdgroup.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@MappedSuperclass
public class BaseBOMEntityWithSurrogate {

    private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=SEQUENCE)
	@Access(AccessType.PROPERTY)
	private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
