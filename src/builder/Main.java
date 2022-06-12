package builder;

public class Main {

	public static void main(String[] args) {

		Person person = new Person.PersonBuilder("TEST", "TEST").setAge(26).setPhone("00001112233")
				.setAddress("Ýstanbul").build();
		
		System.out.print(person);

	}

}
