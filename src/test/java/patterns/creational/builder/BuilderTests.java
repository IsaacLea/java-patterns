package patterns.creational.builder;

import org.junit.jupiter.api.Test;

class BuilderTests {

	@Test
	void test() {
		User user = new User.UserBuilder("44444", "John", "Doe")
			      .address("Victoria")
			      .build();
			    System.out.println(user);
	}

}
