package patterns.creational.builder;

public class User {

	private final String ssn; // required
	private final String firstName; // required
	private final String lastName; // required
	private final String phone; // optional
	private final String address; // optional

	private User(UserBuilder builder) {
		this.ssn = builder.ssn;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	public String getSsn() {
		return ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	
	

	@Override
	public String toString() {
		return "User [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	public static class UserBuilder {

		private final String ssn;
		private final String firstName;
		private final String lastName;
		private String phone;
		private String address;

		// Constructor for required fields
		public UserBuilder(String ssn, String firstName, String lastName) {
			// TODO Validate required fields
			this.ssn = ssn;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		// Optional fields
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			// additional validation can be done here
			return new User(this);
		}
	}
}
