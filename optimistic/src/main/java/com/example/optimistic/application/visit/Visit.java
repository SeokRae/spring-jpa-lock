package com.example.optimistic.application.visit;

import com.example.optimistic.core.domain.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@Table(name = "VISITS")
public class Visit extends BaseEntity {

    @Column(name = "PET_ID")
    private Integer petId;

    @Column(name = "VISIT_DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @NotEmpty
    @Column(name = "DESCRIPTION")
    private String description;

}