package e2;

public class e2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student("Alice", "Physics", 2);
		Student b = new Student("Bob", "Math", 4);
		
		StudentFormatter format1 = student -> "Student " + student.getName() + ", Year " + student.getYear();
		StudentFormatter format2 = student -> student.getName() + " studies " + student.getMajor() + " in Year " + student.getYear();
		System.out.println(format1.format(a));
		System.out.println(format2.format(a));
		System.out.println(format1.format(b));
		System.out.println(format2.format(b));
	}

}
