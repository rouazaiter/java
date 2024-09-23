import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrée de l'utilisateur pour le nom et le nombre de cages du zoo
        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        int nbrCages = 0;
        while (true) {
            System.out.print("Entrez le nombre de cages (valeur positive) : ");
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                if (nbrCages > 0) {
                    break;
                } else {
                    System.out.println("Veuillez entrer un nombre positif.");
                }
            } else {
                System.out.println("Veuillez entrer un nombre valide.");
                scanner.next(); // Vider l'entrée incorrecte
            }
        }

        // Création du zoo
        Zoo myZoo = new Zoo(zooName, "Paris", nbrCages);

        // Création d'un animal (lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);

        // Ajout de l'animal au zoo
        myZoo.addAnimal(lion, 0);

        // Affichage des informations du zoo
        myZoo.displayInfo();
    }
}
