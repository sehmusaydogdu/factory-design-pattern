package com.example;

public class Application {

	enum PersonelType {
		TEACHER, STUDENT
	}

	public static void main(String[] args) {
		String name = "Ali";
		byte age = 15;

		IPersonel student = PersonelFactory.getPersonel(PersonelType.STUDENT.toString(), name, age);
		System.out.println(student.displayInfo());

		name = "Ayþe";
		age = 20;
		
		IPersonel teacher = PersonelFactory.getPersonel(PersonelType.TEACHER.toString(), name, age);
		System.out.println(teacher.displayInfo());
	}
}
