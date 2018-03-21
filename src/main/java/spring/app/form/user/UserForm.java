package spring.app.form.user;

import java.io.Serializable;

public class UserForm implements Serializable {

	private String userId;

	private String firstName;

	private String lastName;

	private String password;

	private String userRole;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserForm ["
				+ "userId=" + userId
				+ ", firstName=" + firstName
				+ ", lastName=" + lastName
				+ ", userRole=" + userRole
				+ "]";
	}




}
