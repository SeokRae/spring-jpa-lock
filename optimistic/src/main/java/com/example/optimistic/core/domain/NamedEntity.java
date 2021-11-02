package com.example.optimistic.core.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
@ToString
public class NamedEntity extends BaseEntity {

    @Column(name = "NAME")
    private String name;
}
