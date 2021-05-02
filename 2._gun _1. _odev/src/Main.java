

public class Main {

	public static void main(String[] args) {
		CourseName courseName = new CourseName();
		courseName.StudentName = "Yusuf";
		
		CourseNameManager courseNameManager = new CourseNameManager();
		courseNameManager.Register(courseName);
		
		
		
		 
		
		InstructorName ýnstructorName = new InstructorName();
		ýnstructorName.Ýnstructorname = "Engin";

		InstructorNameManager instructorNameManager = new InstructorNameManager();
		InstructorNameManager.Tera(ýnstructorName);
		
		
		
		
		CourseName.courseName2 = new CourseName();
		courseName.DersName = "C#";

		CourseNameManager courseNameManager1 = new CourseNameManager();
		courseNameManager1.Begin(courseName);
		
		
		
		InstructorName instructorName = new InstructorName();
		ýnstructorName.id = 1;
		
		InstructorNameManager instructorNameManager1 = new InstructorNameManager();
		InstructorNameManager.Beta(ýnstructorName);

	}	
	

}
