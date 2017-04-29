package juniorro.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import juniorro.entity.Student;
import juniorro.repository.StudentRepository;

@Controller
@RequestMapping(value = "/home")
public class StudentController {;
	@Autowired
	private StudentRepository studentRepository;

	@Value("${image.dir}")
	private String imageDir;

	@RequestMapping(value = "/students")
	public String index(Model model, @RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "name", defaultValue = "") String name) {
		Page<Student> students = studentRepository.findByFirstName("%" + name + "%", new PageRequest(page, 10));
		int pagesNum = students.getTotalPages();
		int[] thePages = new int[pagesNum];
		for (int i = 0; i < pagesNum; i++)
			thePages[i] = i;
		model.addAttribute("page", thePages);
		model.addAttribute("students", students);
		model.addAttribute("currentPage", page);
		model.addAttribute("name", name);
		return "home";
	}

	@RequestMapping(value = "/register", method=RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("student", new Student());
		return "register";
	}

	@RequestMapping(value = "/saveStudent", method=RequestMethod.POST)
	public String saveNew(@Valid Student student, BindingResult bindingResult, @RequestParam(name = "pic")MultipartFile filePhoto) throws IllegalStateException, IOException{
		if(bindingResult.hasErrors()){
			return "register";
		}
		if(!(filePhoto.isEmpty())){
			student.setPhoto(filePhoto.getOriginalFilename());
			filePhoto.transferTo(new File(System.getProperty("user.home")+"/Pictures/studentPics/"+filePhoto.getOriginalFilename()));
		}
		studentRepository.save(student);
		return "redirect:students";
	}
}
