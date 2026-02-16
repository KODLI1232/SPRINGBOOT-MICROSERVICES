package Com.self.Spring.JDBCOperations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Management {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void saveSticker() {
		String query="Insert into stickers (idStickers,nameStickers,sizeStickers) values(?,?,?)";
		jdbcTemplate.update(query, 54,"LORD",39);
	}
	
	public void loadAllStickers() {
	String query="Select * from stickers where idStickers=?"; 
	List<StickerDetails> allSticker =	jdbcTemplate.query(query, 
			new BeanPropertyRowMapper<StickerDetails>(StickerDetails.class),1);
	
	allSticker.forEach(sticker->{
		System.out.println(sticker.getIdStickers());
		
		System.out.println(sticker.getNameStickers());
		
		System.out.println(sticker.getSizeStickers());
	});
	
	}
}
