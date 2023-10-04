// Menu.java
package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Catalog catalog = new Catalog();

    public void executeMenu() {
        boolean exit = false;

        while (!exit) {
            // Exibe as opções do menu
            System.out.println("Choose what do you wanna do: \n" +
                    "1 - Register Movie\n" +
                    "2 - Remove Movie\n" +
                    "3 - List Movies\n" +
                    "4 - Exit");
            System.out.print("Option: ");

            // Lê a opção escolhida pelo usuário
            int optionUser = scanner.nextInt();
            scanner.nextLine(); // Consome a quebra de linha

            switch (optionUser) {
                case 1:
                    // Opção 1: Registrar um filme
                    Movies newMovie = new Movies();
                    newMovie.registerMovies();
                    catalog.addMovies(newMovie);
                    System.out.println("____________________________");
                    System.out.println("Title added successfully!");
                    System.out.println("____________________________");
                    break;
                case 2:
                    // Opção 2: Remover um filme
                    System.out.print("Enter the title of the movie to remove: ");
                    String movieTitle = scanner.nextLine();
                    boolean removed = catalog.removeMovies(movieTitle);
                    if (removed) {
                        System.out.println("______________________________");
                        System.out.println("Title removed successfully!");
                        System.out.println("______________________________");
                    } else {
                        System.out.println("______________________________");
                        System.out.println("Title not found. It was not removed.");
                        System.out.println("______________________________");
                    }
                    break;
                case 3:
                    // Opção 3: Listar filmes
                    catalog.listMovies();
                    break;
                case 4:
                    // Opção 4: Sair do programa
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
