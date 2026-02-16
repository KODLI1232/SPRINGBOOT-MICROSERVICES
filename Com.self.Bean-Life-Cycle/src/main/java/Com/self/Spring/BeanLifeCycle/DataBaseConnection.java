package Com.self.Spring.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value="prototype")
@Component
public class DataBaseConnection implements InitializingBean, DisposableBean {

	@Value("loclHost:1502")
	private String url;
	private String userName;
	private String password;
	
	public DataBaseConnection() {
		
		System.out.println("DataBase Connection created");
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Value("KSK")
	public String getUserName() {
		System.out.println("Setting username through setter");
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
	
		System.out.println("This is after propertyset call");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("This is destroy call");
		
	}
	
	
}
