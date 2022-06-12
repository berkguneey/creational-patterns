package builder;

public class Main {

	public static void main(String[] args) {

		Person person = new Person.PersonBuilder("TEST", "TEST").setAge(26).setPhone("00001112233")
				.setAddress("�stanbul").build();
		
		System.out.print(person);

	}

}
