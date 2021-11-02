package com.example.optimistic.application.vet;


import com.example.optimistic.core.domain.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "SPECIALTIES")
public class Specialty extends NamedEntity implements Serializable {

}
