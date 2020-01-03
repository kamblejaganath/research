package com.jacks.research.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stage")
@Where(clause = "actif=true")
@Getter
@Setter
public class Stage {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// other attributes
	
	private String nouveau;

	@DateTimeFormat(pattern = "dd-MM-yyyy") // I've try this but that change nothing
	@Temporal(TemporalType.DATE)
	@Column(name = "date_candidature")
	private Calendar datecandidature;

	@Column(name = "date_reponse")
	@Temporal(TemporalType.DATE)
	private Calendar datereponse;

	@Column(name = "date_relance")
	@Temporal(TemporalType.DATE)
	private Calendar daterelance;
}