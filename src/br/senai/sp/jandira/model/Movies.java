// Movies.java
package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Movies {
    Scanner scanner = new Scanner(System.in);
    private String title, director, genre;
    private int releaseYear, duration;

    public void registerMovies() {
        // Exibe uma mensagem de boas-vindas
        System.out.println("*********************************");
        System.out.println("     Welcome to the FunMovies    ");
        System.out.println("*********************************");

        // Solicita informações do filme ao usuário e as armazena nos atributos da classe
        System.out.print("Title: ");
        title = scanner.nextLine();
        System.out.print("Director's name: ");
        director = scanner.nextLine();
        System.out.print("Genre: ");
        genre = scanner.nextLine();
        System.out.print("Release Year: ");
        releaseYear = scanner.nextInt();
        System.out.print("Movie's duration: ");
        duration = scanner.nextInt();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
