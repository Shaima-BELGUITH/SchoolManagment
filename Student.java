
package entities;

/**
 *
 * @author Shaima BELGUITH
 */
public class Student extends Person {

	private int registrationNumb;

	public Student() {
	}

	public Student(int id, String firstName, String lastName, String adress, int phone, String email,
			String governorate, int vaccPassNumber, int registrationNumb) {
		super(id, firstName, lastName, adress, phone, email, governorate, vaccPassNumber);
		this.registrationNumb = registrationNumb;
	}

	public int getRegistrationNumb() {
		return registrationNumb;
	}

	public void setRegistrationNumb(int registrationNumb) {
		this.registrationNumb = registrationNumb;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "registrationNumber=" + registrationNumb;
	}

	public int hashCode() {
		return 10;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Student other = (Student) obj;
		if (!(this.getFirstName().equals(other.getFirstName()))) {
			return false;
		}
		return true;
	}

}
