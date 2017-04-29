package juniorro.repository;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import juniorro.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public List <Student> findByFirstName(String name);
	
	@Query("SELECT student FROM Student student WHERE student.firstName like :x")
	public Page<Student> findByFirstName(@Param("x") String name, Pageable pageable);
	
	@Query("SELECT student FROM Student student WHERE student.dateOfBirth > :x AND student.dateOfBirth < :y")
	public Student findByDob(@Param("x") Date date1, @Param("x") Date date2);
	
	@Modifying
	@Transactional
	@Query("UPDATE Student student SET student.firstName = :v, student.lastName = :w, student.email = :x, student.dateOfBirth = :y WHERE student.id like :z")
	public void updateStudent(@Param("v") String firstName, @Param("w") String lastName, @Param("x") String email,
			@Param("y") Date dateOfBirth, @Param("z") Long id);
}
