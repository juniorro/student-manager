package juniorro.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "student_table")
public class Student implements Serializable {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "first_name", length = 20)
	@NotEmpty(message="Please enter student first name.")
	@Size(min=2, max=20, message="First name is not valid. Must use between 2 to 20 characters")
	private String firstName;

	@Column(name = "last_name", length = 20)
	@NotEmpty(message="Please enter student last name.")
	@Size(min=2, max=20, message="Last name is not valid. Must use between 2 to 20 characters.")
	private String lastName;

	@Column(name = "email", length = 30)
	@NotEmpty(message="Please enter student email address.")
	@Size(min=5, max=30, message="Email is not valid. Must use between 2 to 30 characters.")
	@Email(message="This does not seem to be a valid email address.")
	private String email;

	@Column(name = "gender", length = 10)
	@NotEmpty(message="Please select a gender")
	@Size(min=2, max=10, message="Gender is not valid. Must use between 2 to 10 characters.")
	private String gender;

	@Column(name = "photo", length = 50)
	private String photo;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String email, String gender, String photo, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.photo = photo;
		this.dateOfBirth = dateOfBirth;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

}
