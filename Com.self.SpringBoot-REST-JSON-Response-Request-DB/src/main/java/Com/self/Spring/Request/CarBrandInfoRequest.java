package Com.self.Spring.Request;

import java.util.List;

public class CarBrandInfoRequest {

	private String brandName;
	// list of class
	 private List<CarInfo> brandinfos;  // make payload should match
	 
	 
	 public CarBrandInfoRequest() {
		
	 }
	 public CarBrandInfoRequest(String brandName, List<CarInfo> brandinfos) {
		
		this.brandName = brandName;
		this.brandinfos = brandinfos;
	 }
	 public String getBrandName() {
		 return brandName;
	 }
	 public void setBrandName(String brandName) {
		 this.brandName = brandName;
	 }
	 public List<CarInfo> getBrandinfos() {
		 return brandinfos;
	 }
	 public void setBrandinfos(List<CarInfo> brandinfos) {
		 this.brandinfos = brandinfos;
	 }
	 @Override
	 public String toString() {
		return "CarBrandInfoRequest [brandName=" + brandName + ", brandinfos=" + brandinfos + "]";
	 }
	 
	 
}
