
package entities;

/**
 *
 * @author Shaima BELGUITH
 */
public abstract class Person {
	private int id;
	private String firstName;
	private String lastName;
	private String adress;
	private int phone;
	private String email;
	private String governorate;
	private int vaccPassNumber;

	public Person() {
	};

	public Person(int id, String firstName, String lastName, String adress, int phone, String email, String governorate,
			int vaccPassNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.phone = phone;
		this.email = email;
		this.governorate = governorate;
		this.vaccPassNumber = vaccPassNumber;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGovernorate() {
		return governorate;
	}

	public void setGovernorate(String governorate) {
		this.governorate = governorate;
	}

	public int getVaccPassNumber() {
		return vaccPassNumber;
	}

	public void setVaccPassNumber(int vaccPassNumber) {
		this.vaccPassNumber = vaccPassNumber;
	}

	@Override
	public String toString() {
		return "\nId=" + id + "\nFirstName=" + firstName + "\nLastName=" + lastName + "\nAdress=" + adress + "\nPhone="
				+ phone + "\nE-mail=" + email + "\nGovernorate=" + governorate + "\nVaccinationPassportNumber="
				+ vaccPassNumber;
	}

}
