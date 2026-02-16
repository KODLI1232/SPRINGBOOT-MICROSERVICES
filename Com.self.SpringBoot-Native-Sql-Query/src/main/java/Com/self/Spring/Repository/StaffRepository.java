package Com.self.Spring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Com.self.Spring.Entity.Staff;
import jakarta.transaction.Transactional;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

    @Query(value ="SELECT * FROM staff", nativeQuery = true)
    List<Staff> getAllStaff();

    @Query(value ="SELECT * FROM staff WHERE city = ?1", nativeQuery = true)
    List<Staff> getEmployeeByCity(String city);

    @Query(value ="SELECT * FROM staff WHERE city = ?1 AND gender = ?2", nativeQuery = true)
    List<Staff> getEmployeeByCityAndGender(String city, String gender);

    @Query(value = "SELECT * FROM staff WHERE city = :city AND age < :age", nativeQuery = true)
    List<Staff> getEmployeeBycityandage(@Param("city") String city, @Param("age") int age);

    @Modifying
    @Transactional
    @Query(value="INSERT INTO staff VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7)", nativeQuery = true)
    int addEmployee(int emp_id, String name, int age, double salary, String country, String city, String gender);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM staff WHERE emp_id = ?1", nativeQuery = true)
    int deleteEmployee(int emp_id);
    
    @Modifying
    @Transactional
    @Query(value = "Delete from staff where age=:age And city=:city",nativeQuery = true)   // we can't use this @param to delete
    List<Staff> getEmpByCityAndAge(@Param("city") String city,@Param("age") int age);
}
