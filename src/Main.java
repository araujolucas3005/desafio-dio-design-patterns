import java.time.LocalDate;

import br.system.system.model.Specialization;
import br.system.system.model.Student;
import br.system.system.model.Teacher;
import br.system.system.service.ClassService;
import br.system.system.service.SpecializationService;
import br.system.system.service.StudentService;
import br.system.system.service.TeacherService;

public class Main {
	
	private static StudentService studentService = StudentService.getInstance();
	private static ClassService classService = ClassService.getInstance();
	private static TeacherService teacherService = TeacherService.getInstance();
	private static SpecializationService specializationSerice = SpecializationService.getInstance();
	
	public static void main(String[] args) {
		
		Student student = new Student.Builder()
				.name("Lucas")
				.birthDate(LocalDate.now())
				.build();
		
		student = studentService.save(student);
		
		Student student2 = new Student.Builder()
				.name("Joao")
				.birthDate(LocalDate.now())
				.build();
		
		student2 = studentService.save(student2);
		
		Specialization mathPhd = new Specialization.Builder()
				.name("Math PhD")
				.build();
		
		mathPhd = specializationSerice.save(mathPhd);
		
		Teacher teacherJose = new Teacher.Builder()
				.name("Jose")
				.birthDate(LocalDate.now())
				.specialization(mathPhd)
				.build();
		
		teacherJose = teacherService.save(teacherJose);
		
		br.system.system.model.Class math = new br.system.system.model.Class.Builder()
				.name("Math")
				.teacher(teacherJose)
				.build();
		
		math = classService.save(math);
		
		teacherJose.getClasses().add(math);
		
		System.out.println(teacherJose.getClasses());
		
		student.addClass(math);
		student2.addClass(math);
		
		System.out.println("Professor: " + teacherJose);
		System.out.println("Turmas do professor: " + teacherJose.getClasses());
		
		System.out.println();
		System.out.println("Turma: " + math);
		System.out.println("Estudantes da turma: " + math.getStudents());
		
	}

}
