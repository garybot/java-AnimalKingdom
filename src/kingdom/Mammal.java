package kingdom;

public class Mammal extends AbstractAnimal {

	public Mammal(String name, int yearDiscovered) {
		super(name, yearDiscovered);
	}

	@Override
	public String move() {
		satiety--;
		return "Walk";
	}

	@Override
	public String breathe() {
		return "Lungs";
	}

	@Override
	public String reproduce() {
		return "Live Birth";
	}

	@Override
	public String toString() {
		return "Id: " + id + " - Mammal: " + name + " - Year Discovered: " + yearDiscovered;
	}

}