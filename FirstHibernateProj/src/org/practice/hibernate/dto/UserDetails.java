package org.practice.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;
	@OneToOne
	private Vehicle vehicle;
	
	
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

/*@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name = "USER_ADDRESS", joinColumns = @JoinColumn(name = "USER_ID") )
	private Collection<Address> listOfAddress = new ArrayList<Address>();

*/	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

//	public Collection<Address> getListOfAddress() {
//		return listOfAddress;
//	}
//
//	public void setListOfAddress(Collection<Address> listOfAddress) {
//		this.listOfAddress = listOfAddress;
//	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/*
	 * public Date getJoinedDate() { return joinedDate; }
	 * 
	 * public void setJoinedDate(Date joinedDate) { this.joinedDate =
	 * joinedDate; }
	 * 
	 * 
	 * 
	 * public Address getHomeAddress() { return homeAddress; }
	 * 
	 * public void setHomeAddress(Address homeAddress) { this.homeAddress =
	 * homeAddress; }
	 * 
	 * public Address getOfficeAddress() { return officeAddress; }
	 * 
	 * public void setOfficeAddress(Address officeAddress) { this.officeAddress
	 * = officeAddress; }
	 * 
	 * public String getDescription() { return description; }
	 * 
	 * public void setDescription(String description) { this.description =
	 * description; }
	 */
}
