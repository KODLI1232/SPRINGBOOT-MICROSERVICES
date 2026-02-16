package Com.self.SpringBoot.Mapper;

import Com.self.SpringBoot.Dtos.AccountResponseDto;
import Com.self.SpringBoot.Entity.AccountEntity;

public class AccountMapper {

	 public static AccountResponseDto toDto(AccountEntity entity) {
	        AccountResponseDto dto = new AccountResponseDto();
	        dto.setId(entity.getId());
	        dto.setUsername(entity.getUsername());
	        dto.setBalance(entity.getBalance());
	        dto.setCustomerId(entity.getCustomerEntity().getId());
	        return dto;
	    }
}
