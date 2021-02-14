package com.example;

public class Student implements IPersonel {

	private String name;
	private byte age;

	public Student(String name, byte age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public byte getAge() {
		return this.age;
	}

	@Override
	public String displayInfo() {
		return String.format("Name = [%s] Age = [%d]", this.name, this.age);
	}
}
