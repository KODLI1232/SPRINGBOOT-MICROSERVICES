package Com.self.SpringBoot.Dtos;

import java.time.LocalDate;

public class CustomerRegisterDto {


    private String fullName;
    private String email;
    private String password;
    private String phone;
    private LocalDate dob;
    private String address;
	
    public CustomerRegisterDto() {
		
	}

	public CustomerRegisterDto(String fullName, String email, String password, String phone, LocalDate dob,
			String address) {
		
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.dob = dob;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
