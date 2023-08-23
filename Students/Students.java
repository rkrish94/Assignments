package Students;

public class Students {

	String name = "Radhakrishnan", email = "rkrish@gmail.com", phoneNumber = "9988776655";

	public void getStudentInfo(int id) {
		System.out.println("Student ID : " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID : " + id);
		System.out.println("Student Name : " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student Email : " + email);
		System.out.println("Student Phone Number : " + phoneNumber);
	}
	public static void main(String[] args) {

		Students studentInfoObject = new Students();

		System.out.println("getStudentInfo method returning studentID");
		studentInfoObject.getStudentInfo(12);
		System.out.println("----------");

		System.out.println("getStudentInfo method being overloaded returning student ID and student name");
		studentInfoObject.getStudentInfo(10, "Radhakrishnan");
		System.out.println("----------");

		System.out.println("getStudentInfo method being overloaded returning student's email and phone number");
		studentInfoObject.getStudentInfo("krish@gmail.com", 456123);
	}

}
