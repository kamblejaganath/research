package com.jacks.research.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2940441040734802982L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private long roleId;

	@Column(name = "name", nullable = false, unique = true)
	@NotEmpty(message = "*Please provide your role name")
	private String name;

	@Column(name = "active")
	boolean active;

	@ManyToOne
	@JoinColumn(columnDefinition = "user_id")
	private MyUser user;
}
