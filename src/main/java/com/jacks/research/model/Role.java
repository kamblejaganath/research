package com.jacks.research.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TB_Role")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2940441040734802982L;

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private long roleId;

	@Column(name = "name", nullable = false, unique = true)
	@NotEmpty(message = "*Please provide your role name")
	private String name;

	@Column(name = "active")
	boolean active;
}
