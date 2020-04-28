import modelo.Libro;

public class LibroApplication {

    public static void main(String[] args) {
        Libro libro1 = new Libro("DFGA12", "Somos Polvos De Estrellas", "José Maza", 136);
        Libro libro2 = new Libro("ASGC34", "Brevísima historia del tiempo", "Sthephen Hawking & Leonard Mlodinow", 224);

        //mostramos los libros por pantalla

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        mayorPagina(libro1, libro2);


    }

    public static void mayorPagina(Libro a, Libro b) {
        if (a.getNumPaginas() > b.getNumPaginas()) {
            System.out.println("El libro que tiene más paginas es: " + a.getTitulo());
        } else {
            System.out.println("El libro que tiene más paginas es: " + b.getTitulo());
        }
    }
}
