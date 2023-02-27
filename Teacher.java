/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Shaima BELGUITH
 *
 */
public class Teacher extends Person {
	private Grade grade;

	public Teacher() {
		super();
	}

	public Teacher(int id, String firstName, String lastName, String adress, int phone, String email,
			String governorate, int vaccPassNumber, Grade grade) {
		super(id, firstName, lastName, adress, phone, email, governorate, vaccPassNumber);
		this.grade = grade;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return super.toString() + "\nGrade=" + grade;
	}

}
