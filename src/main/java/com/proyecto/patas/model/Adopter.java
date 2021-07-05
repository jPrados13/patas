package com.proyecto.patas.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Adopter {

	@Id 
	private String dni;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date registerDate;
	
	@NotEmpty
	private String name;
	private String lastname;
	private String phoneNumber;
	private String address;
	
	@Email
	private String email;
	private String password;
	private String age;
	
	public Adopter() {
		super();
	}
	public Adopter(String dni, String name, String lastname, String phoneNumber, String address,
			String email, String password, String age) {
		super();
		this.dni = dni;
		this.name = name;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.password = password;
		this.age = age;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, age, dni, email, lastname, name, password, phoneNumber, registerDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adopter other = (Adopter) obj;
		return Objects.equals(address, other.address) && Objects.equals(age, other.age)
				&& Objects.equals(dni, other.dni) && Objects.equals(email, other.email)
				&& Objects.equals(lastname, other.lastname) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(registerDate, other.registerDate);
	}
	@Override
	public String toString() {
		return "Adopter [dni=" + dni + ", registerDate=" + registerDate + ", name=" + name + ", lastname=" + lastname
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", email=" + email + ", password="
				+ password + ", age=" + age + "]";
	}
		
}
