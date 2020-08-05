package kingdom;

public class Bird extends AbstractAnimal {

	public Bird(String name, int yearDiscovered) {
		super(name, yearDiscovered);
	}
	
	@Override
	public String move() {
		satiety--;
		return "Fly";
	}

	@Override
	public String breathe() {
		return "Lungs";
	}

	@Override
	public String reproduce() {
		return "Eggs";
	}

	@Override
	public String toString() {
		return "Id: " + id + " - Bird: " + name + " - Year Discovered: " + yearDiscovered;
	}

	
}