import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {

    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MINI TODO APP ===");

        while (true) {
            System.out.println("\n1. Ajouter une tâche");
            System.out.println("2. Afficher les tâches");
            System.out.println("3. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Entrez la tâche : ");
                String task = scanner.nextLine();

                tasks.add(task);
                System.out.println("Tâche ajoutée !");
            }

            else if (choice == 2) {
                System.out.println("\n--- MES TÂCHES ---");

                if (tasks.isEmpty()) {
                    System.out.println("Aucune tâche.");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            }

            else if (choice == 3) {
                System.out.println("Au revoir !");
                break;
            }

            else {
                System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}