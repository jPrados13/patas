package com.proyecto.patas.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class PetAnimal {

	@Id @GeneratedValue
	private long id;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private Date registerDate;
	
	private String name;
	private String type;
	private String age;
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "petshelter_id", foreignKey = @ForeignKey(name="PETSHELTER_ID_FK"))
	private PetShelter shelter;

	@ManyToOne
	@JoinColumn(name = "adopter_id", foreignKey = @ForeignKey(name="ADOPTER_ID_FK"))
	private Adopter adopter;

	public PetAnimal () {}
	
	public PetAnimal(String name, String type, String age, String image, PetShelter shelter) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.image = image;
		this.shelter = shelter;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public PetShelter getShelter() {
		return shelter;
	}

	public void setShelter(PetShelter shelter) {
		this.shelter = shelter;
	}

	public Adopter getAdopter() {
		return adopter;
	}

	public void setAdopter(Adopter adopter) {
		this.adopter = adopter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adopter, age, id, image, name, registerDate, shelter, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PetAnimal other = (PetAnimal) obj;
		return Objects.equals(adopter, other.adopter) && Objects.equals(age, other.age) && id == other.id
				&& Objects.equals(image, other.image) && Objects.equals(name, other.name)
				&& Objects.equals(registerDate, other.registerDate) && Objects.equals(shelter, other.shelter)
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "PetAnimal [id=" + id + ", registerDate=" + registerDate + ", name=" + name + ", type=" + type + ", age="
				+ age + ", image=" + image + ", shelter=" + shelter + ", adopter=" + adopter + "]";
	}
	
	
	
	
	
}
