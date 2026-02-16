package Com.self.SpringBoot.Configuration;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class ConfigData {

	@Value("${contact.email}")
	private String contactEmail;
}
