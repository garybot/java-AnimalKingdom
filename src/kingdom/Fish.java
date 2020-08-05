package kingdom;

public class Fish extends AbstractAnimal {

	public Fish(String name, int yearDiscovered) {
		super(name, yearDiscovered);
	}
	
	@Override
	public String move() {
		satiety--;
		return "Swim";
	}

	@Override
	public String breathe() {
		return "Gills";
	}

	@Override
	public String reproduce() {
		return "Eggs";
	}

	@Override
	public String toString() {
		return "Id: " + id + " - Fish: " + name + " - Year Discovered: " + yearDiscovered;
	}

	
}