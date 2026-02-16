package Com.self.SpringBoot.Request;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomerRequest {

	private Long id;
	private String fullName;
	private String password;
	private String email;
	private String phone;
	private LocalDate dob;
	private String address;
	private String kycStatus;     // PENDING / VERIFIED
	private LocalDateTime createdAt;
	
	public CustomerRequest() {
		
	}

	public CustomerRequest(String fullName, String password, String email, String phone, LocalDate dob, String address,
			String kycStatus, LocalDateTime createdAt) {

		this.fullName = fullName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.address = address;
		this.kycStatus = kycStatus;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getKycStatus() {
		return kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}
