package builder;

public class Person {

	// required parameters
	private final String firstName;
	private final String lastName;

	// optional parameters
	private final int age;
	private final String phone;
	private final String address;
	
	private Person(PersonBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	// Builder Class
	public static class PersonBuilder {

		// required parameters
		private String firstName;
		private String lastName;

		// optional parameters
		private int age;
		private String phone;
		private String address;

		public PersonBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public PersonBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public PersonBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public PersonBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Person build() {
			return new Person(this);
		}

	}

}
