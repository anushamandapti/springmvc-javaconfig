package com.krsna.hrm2.dto;

public class StudentDto {
	
	private String studentName;
	
	//has-a 
	private AddressDto address;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}
	
	
	
	

}
