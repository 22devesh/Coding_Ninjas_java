package classesandobject;

import java.util.Scanner;

public class studentUse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s1 = new Student("devesh" , 123);
		System.out.println(s1);
//		System.out.println(s1.name);
//		System.out.println(s1.getRollNumber());
		s1.print();
		
		
		
		Student s2 = new Student("Manish",121);
		System.out.println(s2);
		s2.print();
//		System.out.println(s1.name);
//		System.out.println(s2.name);
//		System.out.println(s1.getRollNumber());

		System.out.println(Student.getNumStudents()); 
//		System.out.println(s1.getNumStudents());
		
		
		System.out.println(s1.name);
		
//		System.out.println();
//		System.out.println(s1);
		
	}

}
