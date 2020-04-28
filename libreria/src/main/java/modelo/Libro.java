package modelo;

/**
 * Esta clase define un objeto libro
 *
 * @author: Jonathan Lizama
 * @version: 27/04/2020
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String toString() {
        return "Libro: " + this.titulo + "\n" +
                "ISBN: " + this.ISBN + "\n" +
                "Autor: " + this.autor + "\n" +
                "Paginas: " + this.numPaginas + "\n";
    }
}
