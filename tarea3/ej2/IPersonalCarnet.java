package tarea3.ej2;

public interface IPersonalCarnet {

    void setnext(IPersonalCarnet handler);
    IPersonalCarnet next();
    void verificacion(Persona cliente);

}
