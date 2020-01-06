package com.bridgelabz.springboot.UserDto;

public class RegistorUserDto {

	private int id;

	private String firstname;

	private String lastname;

	private String username;

	private String password;

	private String re_enter_password;

	private String email;

	private long phonenumber;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getRe_enter_password() {
		return re_enter_password;
	}

	public void setRe_enter_password(String re_enter_password) {
		this.re_enter_password = re_enter_password;
	}

	@Override
	public String toString() {
		return "RegistorUserDto [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", re_enter_password=" + re_enter_password + ", email=" + email
				+ ", phonenumber=" + phonenumber + "]";
	}

	

}
