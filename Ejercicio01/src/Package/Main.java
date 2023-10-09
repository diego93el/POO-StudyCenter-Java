package Controlador.Package;

public class Main {
    public static void main(String[] args) {
     Profesor profesor=new Profesor("5166332211R","Carlos Robles","C/ Pez volador, 35","616669922","Matematicas y Lenguas");
     Alumno alumno=new Alumno("532224411A","Alicia Torres", "C/ Luna Lunera,45","639889999","1ª Bachillerato");
     Administrativo administrativo=new Administrativo("123454411A","Rosa Torres","C/ Luna lunera,45 ","639889999","Hacer matriculas, controlar asistencia");
     System.out.println(profesor);
     System.out.println(profesor.trabajar());
     System.out.println(" ");
     System.out.println(alumno);
     System.out.println(alumno.trabajar());
     System.out.println(" ");
     System.out.println(administrativo);
     System.out.println(administrativo.trabajar());
     System.out.println(" ");
     System.out.println(" ");
     System.out.println(alumno.llamar(profesor));
     System.out.println(" ");
     System.out.println(profesor.ponerNotas());
     System.out.println(alumno.hacerExamen());
     System.out.println(administrativo.gestionarMatricula());
    }
}