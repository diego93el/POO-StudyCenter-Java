package Controlador.Package;

public class Administrativo extends Persona{
    private String tareas;

    public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
        super(nif, nombre, direccion, telefono);
        this.tareas = tareas;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    public String gestionarMatricula(){
          return "El administrativo "+getNombre()+" va a gestionar una matricula";
    }
    @Override
    public String trabajar(){
        return "El administrativo "+getNombre()+" va a realizar las siguientes tareas: "+tareas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tareas:" + tareas;
    }
}
