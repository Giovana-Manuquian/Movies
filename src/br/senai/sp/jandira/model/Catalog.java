// Catalog.java
package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalog {
    List<Movies> listCatalog = new ArrayList<>();

    public void addMovies(Movies movies) {
        // Adiciona um filme à lista do catálogo
        listCatalog.add(movies);
    }

    public boolean removeMovies(String titleToRemove) {
        Iterator<Movies> iterator = listCatalog.iterator();

        while (iterator.hasNext()) {
            Movies movie = iterator.next();
            if (movie.getTitle().equalsIgnoreCase(titleToRemove)) {
                iterator.remove(); // Remove o filme com segurança
                return true; // Retorna true quando o filme for encontrado e removido.
            }
        }
        return false; // Retorna false se o filme não for encontrado.
    }

    public void listMovies() {
        // Método para listar filmes no catálogo
        for (Movies catalog : listCatalog) {
            System.out.println("___________________________________________");
            System.out.println("Title: " + catalog.getTitle());
            System.out.println("Director: " + catalog.getDirector());
            System.out.println("Genre: " + catalog.getGenre());
            System.out.println("Release Year: " + catalog.getReleaseYear());
            System.out.println("Duration: " + catalog.getDuration());
            System.out.println("___________________________________________");
        }
    }
}
