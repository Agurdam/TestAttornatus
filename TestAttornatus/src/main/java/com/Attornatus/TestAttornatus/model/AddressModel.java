package com.Attornatus.TestAttornatus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_address")
public class AddressModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String neighborhood;
	private String street;
	private String number;
	private String city;
	private String CEP;
	private boolean mainAddress;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private PersonModel person_id;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public Boolean getMainAdress() {
		return mainAddress;
	}
	public void setMainAdress(Boolean mainAddress) {
		this.mainAddress = mainAddress;
	}
	public PersonModel getPerson() {
		return person_id;
	}
	public void setPerson(PersonModel person) {
		this.person_id = person;
	}
		
}
