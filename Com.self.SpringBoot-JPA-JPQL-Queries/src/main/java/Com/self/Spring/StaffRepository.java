package Com.self.Spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

	@Query(value = "select e from Staff e",nativeQuery = false)
    public List<Staff> loadAllEmployees();
	
	// sql query
	@Query(value = "select * from Staff ",nativeQuery = true)
    public List<Staff> loadAllEmployeesNative();

	@Query(value="select x.age from Staff x",nativeQuery = false)
	public List<Integer> loadEmpNameAge();


	// based on city indexd
	
	@Query(value="select x.city from Staff x where city=?1",nativeQuery = false)
	public List<String> getCityIndexed(String city);
	
	// based on city named
	@Query(value="select x.city from Staff x where city=:city",nativeQuery = false)
	public List<String> getCityNamed(@Param("city") String city);
}
