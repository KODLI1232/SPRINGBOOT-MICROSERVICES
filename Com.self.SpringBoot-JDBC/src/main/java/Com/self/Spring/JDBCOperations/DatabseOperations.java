package Com.self.Spring.JDBCOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabseOperations {

	// ReQ: adding values
	//Insert into Product (idStickers,nameStickers,sizeStickers) values('1','KL',24)
	
	// DI
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void addSticker() {
		
		/*IN JDBC:
		String query="Insert into Product (idStickers,nameStickers,sizeStickers) values('1','KL',24)";*/
		
		// DML
		jdbcTemplate.update("Insert into stickers (idStickers,nameStickers,sizeStickers) values('63','SKY',36)");
	}
	
	public void deleteSticker() {
		
	
	int noOfDeleted=	jdbcTemplate.update("Delete from stickers where idStickers=11");
		System.out.println("Records Deleted: "+noOfDeleted);
	
	}
	
}
