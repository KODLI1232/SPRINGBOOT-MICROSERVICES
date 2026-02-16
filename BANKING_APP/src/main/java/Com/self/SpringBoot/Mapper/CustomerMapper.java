package Com.self.SpringBoot.Mapper;

import java.time.LocalDateTime;

import Com.self.SpringBoot.Dtos.CustomerRegisterDto;
import Com.self.SpringBoot.Dtos.CustomerResponseDto;
import Com.self.SpringBoot.Entity.CustomerEntity;

public class CustomerMapper {

	  public static CustomerEntity toEntity(CustomerRegisterDto dto) {
	        CustomerEntity entity = new CustomerEntity();
	        entity.setFullName(dto.getFullName());
	        entity.setEmail(dto.getEmail());
	        entity.setPassword(dto.getPassword());
	        entity.setPhone(dto.getPhone());
	        entity.setDob(dto.getDob());
	        entity.setAddress(dto.getAddress());
	        entity.setKycStatus("PENDING");
	        entity.setCreatedAt(LocalDateTime.now());
	        return entity;
	    }

	    public static CustomerResponseDto toDto(CustomerEntity entity) {
	        CustomerResponseDto dto = new CustomerResponseDto();
	        dto.setId(entity.getId());
	        dto.setFullName(entity.getFullName());
	        dto.setEmail(entity.getEmail());
	        dto.setPhone(entity.getPhone());
	        dto.setKycStatus(entity.getKycStatus());
	        dto.setCreatedAt(entity.getCreatedAt());
	        return dto;
	    }
}
