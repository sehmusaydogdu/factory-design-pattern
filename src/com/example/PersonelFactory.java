package com.example;

public class PersonelFactory {

	public static IPersonel getPersonel(String personelType, String name, byte age) {
		switch (personelType) {
		case "STUDENT":
			return new Student(name, age);
		case "TEACHER":
			return new Teacher(name, age);
		default:
			return null;
		}
	}
}
