package Controlador.Package;

import Modelo.Autor;
import Modelo.Libro;

public class Main {
    public static void main(String[] args) {
        Autor autor=new Autor("Mark Twain");
        System.out.println(autor.toString());
        Libro libro=new Libro("Las aventuras de Tom Sawyer","Narrativa", autor);
        libro.modificarBiografia("Escritor estadounidense. Aventurero incansable, encontró en su propia vida la inspiración para sus obras literarias. " +
                "Creció en Hannibal, pequeño pueblo ribereño del Mississippi. A los doce años quedó huérfano de padre, abandonó los estudios y entró como aprendiz de tipógrafo en una editorial, " +
                "a la vez que comenzó a escribir sus primeros artículos periodísticos en redacciones de Filadelfia y Saint Louis. ");

        System.out.println(libro.toString());
        libro.setGenero("Picaresca");
        System.out.println(libro.toString());




    }
}