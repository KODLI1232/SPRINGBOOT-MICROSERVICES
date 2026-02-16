package Com.self.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

import Com.self.SpringBoot.Dtos.CustomerLoginDto;
import Com.self.SpringBoot.Dtos.CustomerRegisterDto;
import Com.self.SpringBoot.Dtos.CustomerResponseDto;
import Com.self.SpringBoot.Entity.CustomerEntity;
import Com.self.SpringBoot.Mapper.CustomerMapper;
import Com.self.SpringBoot.Repository.CustomerRepository;
//import Com.self.SpringBoot.Request.CustomerRequest;

@Service
public class CustomerService {
	
//	@Autowired
//	CustomerRepository customerRepository;
//	
//	public String customerSignUp(@RequestBody CustomerRequest customerRequest){
//		
//		if(customerRepository.existsByEmail(customerRequest.getEmail())) {
//			
//			return "Customer already Exists";
//		}
//		else {
//		CustomerEntity customerEntity =new CustomerEntity();
//		customerEntity.setId(customerRequest.getId());
//		customerEntity.setAddress(customerRequest.getAddress());
//		customerEntity.setCreatedAt(customerRequest.getCreatedAt());
//		customerEntity.setDob(customerRequest.getDob());
//		customerEntity.setEmail(customerRequest.getEmail());
//		customerEntity.setFullName(customerRequest.getFullName());
//		customerEntity.setKycStatus(customerRequest.getKycStatus());
//		customerEntity.setPassword(customerRequest.getPassword());
//		customerEntity.setPhone(customerRequest.getPhone());
//		
//		customerRepository.save(customerEntity);
//		}
//		return "Customer registered successfully";
//	}
//	
//	public String customerLogin(@RequestBody CustomerLoginDto customerLoginDto) {
//		
//		
//		CustomerEntity customerEntity=customerRepository.findByEmail(customerLoginDto.getEmail())
//				.orElseThrow(()-> new RuntimeException("Invalid Email/password"));
//		
//		return "Customer Login Successfull"+customerEntity.getFullName();
//	}
	
	

	    @Autowired
	    CustomerRepository customerRepository;

	    public CustomerResponseDto customerSignUp(CustomerRegisterDto dto) {

	        if (customerRepository.existsByEmail(dto.getEmail())) {
	            throw new RuntimeException("Customer already exists");
	        }

	        CustomerEntity entity = CustomerMapper.toEntity(dto);
	        CustomerEntity saved = customerRepository.save(entity);

	        return CustomerMapper.toDto(saved);
	    }

	    public String customerLogin(CustomerLoginDto customerLoginDto) {

	        CustomerEntity customer = customerRepository.findByEmail(customerLoginDto.getEmail())
	                .orElseThrow(() -> new RuntimeException("Invalid Email/Password"));

	        if (!customer.getPassword().equals(customerLoginDto.getPassword())) {
	            throw new RuntimeException("Invalid Email/Password");
	        }

	        return "Customer Login Successful: " + customer.getFullName();
	    }
	}



