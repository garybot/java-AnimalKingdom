package kingdom;

abstract class AbstractAnimal {
	static int maxId = 0;

	protected int id;
	protected String name;
	protected int yearDiscovered;
	protected int satiety;

	public AbstractAnimal(String name, int yearDiscovered) {
		this.id = maxId++;

		this.name = name;
		this.yearDiscovered = yearDiscovered;
		this.satiety = 10;

	}

	abstract String move();
	abstract String breathe();
	abstract String reproduce();
	
	// String move() {
	// 	satiety--;
	// }

	// String move(int distance) {
	// 	satiety -= distance;
	// }

	void eat(int amount) {
		satiety += amount;
	}

	int getSatiety() {
		return satiety;
	}
	String getName() {
		return name;
	}
	int getYear() {
		return yearDiscovered;
	}
}