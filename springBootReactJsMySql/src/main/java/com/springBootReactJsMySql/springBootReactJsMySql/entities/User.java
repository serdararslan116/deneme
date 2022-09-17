package com.springBootReactJsMySql.springBootReactJsMySql.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {

	@Id
	Long id; 
	
	String userName;
	String password;
	
    public String getUserName() {
        return this.userName;
    }

    public void SetUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }

    public void SetPassword(String password) {
        this.password = password;
    }
} 
 