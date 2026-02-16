package Com.self.Spring.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;   // my own chatgpt
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name="mobiles")
public class UserInfo {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idStickers")
	private int idStickers;
	
	@Column(name="nameStickers")
	private String nameStickers;
	
	@Column(name="sizeStickers")
	private String sizeStickers;

	public int getIdStickers() {
		return idStickers;
	}

	public void setIdStickers(int idStickers) {
		this.idStickers = idStickers;
	}

	public String getNameStickers() {
		return nameStickers;
	}

	public void setNameStickers(String nameStickers) {
		this.nameStickers = nameStickers;
	}

	public String getSizeStickers() {
		return sizeStickers;
	}

	public void setSizeStickers(String sizeStickers) {
		this.sizeStickers = sizeStickers;
	}

	
}
