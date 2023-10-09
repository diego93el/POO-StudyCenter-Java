package Controlador.Package;

public class Alumno extends Persona{
    private String curso;

    public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
        super(nif, nombre, direccion, telefono);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String hacerExamen(){
         return "El alumno "+getNombre()+" va hacer su examen";
    }
    @Override
    public String trabajar(){
        return "El alumno "+getNombre()+" va a estudiar para el curso de "+curso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Curso:" + curso;
    }
}
