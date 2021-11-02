package com.example.optimistic.application.pet;

import com.example.optimistic.core.domain.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TYPES")
public class PetType extends NamedEntity {

}