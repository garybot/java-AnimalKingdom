package kingdom;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static List<AbstractAnimal> filteredList = new ArrayList<>();

	public static void filterAnimal(List<AbstractAnimal> animals, CheckAnimal check) {
		filteredList.clear();
		for (AbstractAnimal a : animals) {
			if (check.test(a)) {
				filteredList.add(a);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("*** Animal Kingdom ***");
		List<AbstractAnimal> myAnimals = new ArrayList<>();

		Mammal panda = new Mammal("Panda", 1869);
		myAnimals.add(panda);
		Mammal zebra = new Mammal("Zebra", 1778);
		myAnimals.add(zebra);
		Mammal koala = new Mammal("Koala", 1816);
		myAnimals.add(koala);
		Mammal sloth = new Mammal("Sloth", 1804);
		myAnimals.add(sloth);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		myAnimals.add(armadillo);
		Mammal racoon = new Mammal("Racoon", 1758);
		myAnimals.add(racoon);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);
		myAnimals.add(bigfoot);
		Bird pigeon = new Bird("Pigeon", 1837);
		myAnimals.add(pigeon);
		Bird peacock = new Bird("Peacock", 1821);
		myAnimals.add(peacock);
		Bird toucan = new Bird("Toucan", 1758);
		myAnimals.add(toucan);
		Bird parrot = new Bird("Parrot", 1824);
		myAnimals.add(parrot);
		Bird swan = new Bird("Swan", 1837);
		myAnimals.add(swan);
		Fish salmon = new Fish("Salmon", 1758);
		myAnimals.add(salmon);
		Fish catfish = new Fish("Catfish", 1758);
		myAnimals.add(catfish);
		Fish perch = new Fish("Perch", 1758);
		myAnimals.add(perch);
		System.out.println(myAnimals);

		System.out.println("\n*** Descending order by year ***");
		myAnimals.sort((a1, a2) -> a2.getYear() - a1.getYear());
		System.out.println(myAnimals);

		System.out.println("\n*** alphabetically ***");
		myAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		System.out.println(myAnimals);

		System.out.println("\n*** movement ***");
		myAnimals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		System.out.println(myAnimals);

		System.out.println("\n*** breath with lungs ***");
		filterAnimal(myAnimals, a -> a.breathe() == "Lungs");
		filteredList.forEach((a) -> System.out.println(a.getName() + " " + a.move() + " " + a.reproduce() + " " + a.breathe() + " " + a.getYear()));

		System.out.println("\n*** lungs, named in 1758 ***");
		filterAnimal(myAnimals, a -> a.breathe() == "Lungs" && a.getYear() == 1758);
		filteredList.forEach((a) -> System.out.println(a.getName() + " " + a.move() + " " + a.reproduce() + " " + a.breathe() + " " + a.getYear()));

		System.out.println("\n*** eggs and lungs ***");
		filterAnimal(myAnimals, a -> a.breathe() ==  "Lungs" && a.reproduce() == "Eggs");
		filteredList.forEach((a) -> System.out.println(a.getName() + " " + a.move() + " " + a.reproduce() + " " + a.breathe() + " " + a.getYear()));

		System.out.println("\n*** alphabetically, 1758 ***");
		filterAnimal(myAnimals, a -> a.getYear() == 1758);
		filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		filteredList.forEach((a) -> System.out.println(a.getName() + " " + a.move() + " " + a.reproduce() + " " + a.breathe() + " " + a.getYear()));

		System.out.println("\n*** alphabetically, Mammals ***");
		filterAnimal(myAnimals, a -> a instanceof Mammal);
		filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		filteredList.forEach((a) -> System.out.println(a.getName() + " " + a.move() + " " + a.reproduce() + " " + a.breathe() + " " + a.getYear()));

	}
}