package com.niit.Wproject.Model;
import javax.persistence.*;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Sup1 {
	@Id
	@Size(min=2,max=5, message="Id should be of size 5")
    private String userId;
	@NotEmpty(message="name is requied")
	@Size(min=2,max=20, message="name should be size of 2")
    private String userName;
	@Pattern(regexp="^(.+)@(.+)$", message="Enter a valid mail address")
	private String userEmail;
	@Pattern(regexp="\\d{10}$", message="Enter 10 digit number")
	private String userMobileNo;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	
	
	
}

