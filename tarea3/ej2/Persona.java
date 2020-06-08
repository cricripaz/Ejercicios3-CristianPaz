package tarea3.ej2;

public class Persona {

    private String nombre;
    private Requisito requisito;


    public Persona(String nombre, Requisito requisito) {
        this.nombre = nombre;
        this.requisito = requisito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Requisito getRequisito() {
        return requisito;
    }

    public void setRequisito(Requisito requisito) {
        this.requisito = requisito;
    }
}
