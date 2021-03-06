package br.com.six2six.fixturefactory.model;

import java.io.Serializable;
import java.util.Set;

import br.com.six2six.bfgex.Gender;

public class Student implements Serializable {

	private static final long serialVersionUID = 1659316546025160752L;

	private Long id;
	private String firstName;
	private String lastName;
	private Gender gender;
	private String idCardNumber;
	private Set<Address> addresses;
	private Integer testsTaken;
	private double bestScore;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getIdCardNumber() {
		return idCardNumber;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
    public Integer getTestsTaken() {
        return testsTaken;
    }
    public void setTestsTaken(Integer testsTaken) {
        this.testsTaken = testsTaken;
    }
    public double getBestScore() {
        return bestScore;
    }
    public void setBestScore(double bestScore) {
        this.bestScore = bestScore;
    }
}
