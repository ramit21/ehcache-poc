package com.ramit.ehcache.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Builder
public class Users implements Serializable{

	private static final long serialVersionUID = 6746424623164443169L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String team;
	private Long salary;
	
	public Users() {
	}
	
	public Users(String name, String team, Long salary) {
		this.name = name;
		this.team = team;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "name = " + name + ", team = "+team + ", salary = "+salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
}
