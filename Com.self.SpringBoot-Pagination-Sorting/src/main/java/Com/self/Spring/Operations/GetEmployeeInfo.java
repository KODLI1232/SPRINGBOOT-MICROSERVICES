package Com.self.Spring.Operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import Com.self.Spring.Entity.Staff;
import Com.self.Spring.Repository.StaffRepository;

@Component
public class GetEmployeeInfo {

	@Autowired
	StaffRepository staffRepository;
	
	public void getEmpInfo() {
		// not pagination method
		// gives first set of recordds in table based on value provided
		Page<Staff> pageOgj=staffRepository.findAll(org.springframework.data.domain.Pageable.ofSize(3));
	// in list
		List<Staff>	staff =pageOgj.getContent();
	    staff.forEach(System.out::println);
	}
	
	public void getEmployeeInfo(int pageNo, int recordsperPage) {
		
		//PageRequest.of(pageNo, recordsperPage);
	
		List<Staff> eList=staffRepository
										.findAll(PageRequest.of(pageNo, recordsperPage))
										.getContent();
		
		eList.forEach(System.out::println);
	
	}
	
public void getEmployeeInfoSort(int pageNo, int recordsperPage) {
		
		//PageRequest.of(pageNo, recordsperPage);
	
		List<Staff> eList=staffRepository
										.findAll(PageRequest.of(pageNo, recordsperPage,Sort.by("age")))
										.getContent();
		
		eList.forEach(System.out::println);
	
	}
public void getEmployeeInfoSortDESC(int pageNo, int recordsperPage) {
	
	//PageRequest.of(pageNo, recordsperPage);

	List<Staff> eList=staffRepository
									.findAll(PageRequest.of(pageNo, recordsperPage,Sort.by(Direction.DESC,"age")))
									.getContent();
	
	eList.forEach(System.out::println);
}

public void getEmployeeInfoCIityAndAgeSortDESC(int pageNo, int recordsperPage) {
	
	//PageRequest.of(pageNo, recordsperPage);

	List<Staff> eList=staffRepository
									.findAll(PageRequest.of(pageNo, recordsperPage,Direction.DESC,"city","age"))
									.getContent();
	
	eList.forEach(System.out::println);
}

public void getEmployeeinfoCountryAndSalaryDESC(int pageno,int recordsperpage) {
	
	List<Staff> eList=staffRepository
									.findAll(PageRequest.of(pageno, recordsperpage,Direction.DESC,"country","salary"))
									.getContent();
	eList.forEach(System.out::println);
}
public void getEmployeeInfoSortSalary(int pageNo, int recordsperPage) {
	
	

	List<Staff> eList=staffRepository
									.findAll(PageRequest.of(pageNo, recordsperPage,Sort.by("age")))
									.getContent();
	
	eList.forEach(System.out::println);

}
}
