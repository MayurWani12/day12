package com.factory.second;

public class Student implements Salary{

	@Override
	public int salary() {
		System.out.println("Student salary");
		return 10000;
	}

}
