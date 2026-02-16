package Com.self.Spring.ValueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AwsDBConfiguration {
	@Value("${aws.db.url}")
	private String awsHost;
	@Value("${aws.db.user.name}")
	private String userName;
	@Value("${aws.db.password}")
	private String awsPassword;

	public String getAwsHost() {
		return awsHost;
	}

	public void setAwsHost(String awsHost) {
		this.awsHost = awsHost;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAwsPassword() {
		return awsPassword;
	}

	public void setAwsPassword(String awsPassword) {
		this.awsPassword = awsPassword;
	}
	
	
}
