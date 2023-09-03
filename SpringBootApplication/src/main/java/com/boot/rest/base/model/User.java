package com.boot.rest.base.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users_table")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private int id; // Primary Key

  @Column(length=1000)
  private String firstName;

  @Column
  private String lastName;

  @Column
  private String username;

  @Column
  private String password;

  public int getId() {
    return id;
  }

  public void setId(int id) {
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

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(int id, String firstName, String lastName, String username, String password) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.username = username;
	this.password = password;
}

@Override
  public String toString() {
    return "UserVO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
        + ", password=" + password + "]";
  }

}
