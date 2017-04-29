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
		
		// adding some students
		
		/*studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
		studentRepository.save(new Student("Mary", "Cloe", "john@doe.com", "Female", "photo1", dateFormat.parse("1992-02-10")));
*/
		// removing two students by passing the ID as defined in the repository of type long (we cast the int to long)
//		studentRepository.delete((long) 1);
//		studentRepository.delete((long) 3);
		
		// Getting all the students from the database
		List<Student> listStu = studentRepository.findAll();
		
		System.out.println("-------------Printing All The Students-------------");
		
		for (Student studentList : listStu){
			System.out.println(studentList);
		}
		
		//Student getbyName = studentRepository.findByFirstName("Demian");
		
		//System.out.println("Student get by name is: " + getbyName);
		
		// Get the student whose ID is 2 in the database
//		Student getOneStudent = (Student) studentRepository.findOne((long) 2);
//		
//		System.out.println("----------Printing One student From The Database-----------------");
//		System.out.println(getOneStudent);
		
		//studentRepository.updateStudent("Gesner", "Lamour", "lamo@g.com", dateFormat.parse("12-02-1988"), (long)5);
		
//		Page<Student> pageStudent = studentRepository.findAll(new PageRequest(0, 3));
//		
//		pageStudent.forEach(e->System.out.println(e.getFirstName()));
				
	
	}
}