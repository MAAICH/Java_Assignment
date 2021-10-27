package Lab4;

public class Person {

	// Fields
	private String name;
	private float age;

	// Constructors
	public Person() {
	}

	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

}