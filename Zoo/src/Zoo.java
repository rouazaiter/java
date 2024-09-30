public class Zoo {
	private Animal[] animals;
	private String name;
	private String city;
	private static final int MAX_ANIMALS = 25;
	private int currentAnimalCount;

	public Zoo(String name, String city) {
		this.name = name;
		this.city = city;
		this.currentAnimalCount = 0;
		this.animals = new Animal[MAX_ANIMALS];
	}

	public void displayZoo() {
		System.out.println("Zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + MAX_ANIMALS);
		displayAnimals();  // Affiche les animaux du zoo
	}

	public boolean addAnimal(Animal animal) {
		if (isZooFull()) {
			System.out.println("Le zoo est plein. Impossible d'ajouter de nouveaux animaux.");
			return false;
		}
		if (searchAnimal(animal) != -1) {
			System.out.println("Cet animal existe déjà dans le zoo.");
			return false;
		}
		animals[currentAnimalCount] = animal;
		currentAnimalCount++;
		return true;
	}

	public int searchAnimal(Animal animal) {
		for (int i = 0; i < currentAnimalCount; i++) {
			if (animals[i].equals(animal)) {
				return i;  // Retourne l'indice de l'animal
			}
		}
		return -1;  // Animal non trouvé
	}

	public boolean removeAnimal(Animal animal) {
		int index = searchAnimal(animal);
		if (index != -1) {

			for (int i = index; i < currentAnimalCount - 1; i++) {
				animals[i] = animals[i + 1];
			}
			animals[currentAnimalCount - 1] = null;
			currentAnimalCount--;
			return true;
		}
		return false;
	}

	public void displayAnimals() {
		System.out.println("Animaux dans le zoo :");
		for (int i = 0; i < currentAnimalCount; i++) {
			System.out.println(animals[i]);
		}
	}

	public boolean isZooFull() {
		return currentAnimalCount >= MAX_ANIMALS;
	}

	public static Zoo comparerZoo(Zoo z1, Zoo z2) {
		return z1.currentAnimalCount > z2.currentAnimalCount ? z1 : z2;
	}

	@Override
	public String toString() {
		return "Zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + MAX_ANIMALS + ", Nombre d'animaux: " + currentAnimalCount;
	}
}
