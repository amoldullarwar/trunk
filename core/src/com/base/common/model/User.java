package com.base.common.model;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
@Entity
@Table(name="USER_DATA111")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id;
	private String userName;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String gender;
	
	@Transient
	private boolean isAuthenticated;
	
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<String> city;
	private String traveler;
	
	@ElementCollection
	@LazyCollection(LazyCollectionOption.FALSE)
	private Collection<String> language;

	@Transient
	private Role role;
	
	private String status;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

		public String getTraveler() {
		return traveler;
	}
	public void setTraveler(String traveler) {
		this.traveler = traveler;
	} 

	public Collection<String> getCity() {
		return city;
	}
	public void setCity(Collection<String> city) {
		this.city = city;
	}
	
	public Collection<String> getLanguage() {
		return language;
	}
	
	public void setLanguage(Collection<String> language) {
		this.language = language;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public boolean isAuthenticated() {
		return isAuthenticated;
	}
	
	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}
	
	@Override
	public String toString() {
		return userName + " " + password + " " + email + " " + firstName + " " + lastName + " " + gender + " " + (city!=null ? city.toString():"") + " " + traveler+ " " + (language!= null ? language.toString() : "");
	}
	
	@Override
	public int hashCode() {
		return super.hashCode()
		+(userName!=null? userName.hashCode():0)
		+(password!=null ? password.hashCode():0)
		+(email!=null ? email.hashCode() : 0)
		+(firstName!=null ? firstName.hashCode() : 0)
		+(lastName!=null ? lastName.hashCode() : 0)
		+(gender!=null ? gender.hashCode() : 0)
		+(city!=null ? city.hashCode() : 0)
		+(traveler!=null ? traveler.hashCode() : 0)
		+(language!=null ? language.hashCode() : 0);
	}
}
