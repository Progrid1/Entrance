
public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager();
		InstructorManager instructorManager=new InstructorManager();
		StudentManager studentManager= new StudentManager();
		
		Instructor instructor1= new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("James ");
		instructor1.setLastName("Carter ");
		instructor1.setAge(43);
		instructor1.setInstructorNumber(101);
		instructor1.setInstructorEmail("jamescarter@instructor.com");
		instructor1.setLectureName("Java");
		userManager.logIn(instructor1.getInstructorNumber());
		
		System.out.println(
				"Instructor Number:"+instructor1.getInstructorNumber()+
				" "+"First Name:"+instructor1.getFirstName()+
				"Last Name:"+instructor1.getLastName()+
				"Age:"+instructor1.getAge()+
				" "+"Lecture:"+instructor1.getLectureName()
				);
		instructorManager.addLectureVideo();
		
		Student student1=new Student();
		student1.setId(11);
		student1.setFirstName("Liv ");
		student1.setLastName("Morgan ");
		student1.setAge(21);
		student1.setStudentNumber(1001);
		student1.setStudentEmail("livmorgan@student.com");
		userManager.logIn(student1.getStudentNumber());
		
		System.out.println(
				"Student Number:"+student1.getStudentNumber()+
				" "+"First Name:"+student1.getFirstName()+
				"Last Name:"+student1.getLastName()+
				"Age:"+student1.getAge()
				);
		studentManager.saveHomework();
	
	
	}

}
