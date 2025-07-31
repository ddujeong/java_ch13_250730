package com.ddu.ch13.part01.exam;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		
		return name.hashCode() ;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return student.studentNum == (studentNum);

		} else {
				return false;
		}
		}
	

	
}
