
public abstract class Animal {
	private String name;
	
	abstract void cry();
	
	public Animal(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	String getAnimalName() {
		return name;
	}
}
