package juniorro;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import juniorro.entity.Student;
import juniorro.repository.StudentRepository;

@SpringBootApplication
public class StudentManagerApplication {

	public static void main(String[] args) throws ParseException{
		// scan object
		ApplicationContext context = SpringApplication.run(StudentManagerApplication.class, args);
		
		// get the bean in the Spring context that implements the class interface
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		// formatting the date
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");		
		/*studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("John", "Doe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));		
		studentRepository.save(new Student("Jessica", "Williams", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mackendy", "Burks", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Micheal", "Pence", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));*/

		List<Student> listStu = studentRepository.findAll();
		
		System.out.println("-------------Printing All The Students-------------");
		
		for (Student studentList : listStu){
			System.out.println(studentList);
		}				
	
	}
}