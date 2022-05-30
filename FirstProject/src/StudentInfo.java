class Student
{
	int id;
	String name,course,location;
	public Student(int id, String name, String course, String location) {
		System.out.println("constructor is calling");
		this.id = id;
		this.name = name;
		this.course = course;
		this.location = location;
	}
	
	public void setCourse(String course)
	{
		this.course=course;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d %s %s %s",id,name,course,location);
	}
}
public class StudentInfo {

	public static void main(String[] args) {
		Student s1=new Student(1001,"krishna sree","jav","tiruvallur");
		Student s2=new Student(1002,"sofiya","python","tiruvallur");
		Student s3=new Student(1003,"abi","html","tiruvallur");
		s1.setCourse("java");
		System.out.println("student-1 detail is"+s1);
		System.out.println("student-2 detail is"+s2);
		System.out.println("student-3 detail is"+s3);
	}

}
