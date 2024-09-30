public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tigre", 4, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, false);
        Animal giraffe = new Animal("Giraffidae", "Girafe", 6, false);

        Zoo myZoo = new Zoo("Safari Park", "Nairobi");

        myZoo.addAnimal(lion);  // Ajout réussi
        myZoo.addAnimal(tiger);  // Ajout réussi
        myZoo.addAnimal(elephant);  // Ajout réussi
        myZoo.addAnimal(lion);  // Échec : animal déjà présent


        myZoo.displayAnimals();

        System.out.println("Recherche de lion : " + myZoo.searchAnimal(lion));
        System.out.println("Recherche de girafe : " + myZoo.searchAnimal(giraffe));

        for (int i = 0; i < 23; i++) {
            myZoo.addAnimal(new Animal("Test", "Animal" + i, 3, true));
        }
        System.out.println("Le zoo est-il plein ? " + myZoo.isZooFull());

        myZoo.removeAnimal(tiger);
        System.out.println("Après suppression du tigre :");
        myZoo.displayAnimals();

        Zoo anotherZoo = new Zoo("City Zoo", "New York");
        System.out.println("Comparaison des zoos : Le zoo avec plus d'animaux est " + Zoo.comparerZoo(myZoo, anotherZoo));
    }
}
