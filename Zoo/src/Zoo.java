public class Zoo {
	Animal[] animals = new Animal[25]; // Le zoo peut contenir jusqu'à 25 animaux
	String name;
	String city;
	int nbrCages;

	public Zoo(String name, String city, int nbrCages) {
		this.name = name;
		this.city = city;
		this.nbrCages = nbrCages;
	}

	public void addAnimal(Animal animal, int index) {
		if (index < animals.length) {
			animals[index] = animal;
		} else {
			System.out.println("Le zoo est plein, impossible d'ajouter un nouvel animal.");
		}
	}

	public void displayInfo() {
		System.out.println("Zoo Name: " + name);
		System.out.println("City: " + city);
		System.out.println("Number of Cages: " + nbrCages);
		System.out.println("Animals in the Zoo:");
		for (Animal animal : animals) {
			if (animal != null) {
				animal.displayInfo();
				System.out.println();
			}
		}
	}
}
