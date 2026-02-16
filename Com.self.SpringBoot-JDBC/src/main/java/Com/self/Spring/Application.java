package Com.self.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Com.self.Spring.JDBCOperations.DatabseOperations;
import Com.self.Spring.JDBCOperations.Management;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext container =	SpringApplication.run(Application.class, args);
	
//	DatabseOperations dbDatabseOperations =container.getBean(DatabseOperations.class);
//	
//	dbDatabseOperations.addSticker();
//	dbDatabseOperations.deleteSticker();
	
	Management mngt= container.getBean(Management.class);
	
	//mngt.saveSticker();
	
	mngt.loadAllStickers();
	
	}

}
