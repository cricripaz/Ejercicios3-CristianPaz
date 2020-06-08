package tarea3.ej2;

public class Organizador implements IPersonalCarnet{

    private IPersonalCarnet next;
    @Override
    public void setnext(IPersonalCarnet handler) {
        this.next = handler;
    }

    @Override
    public IPersonalCarnet next() {
        return this.next;
    }

    @Override
    public void verificacion(Persona cliente) {

        ResponsableCarnetizacion responsableCarnetizacion =new ResponsableCarnetizacion();
        Notario notario = new Notario();
        Cajero cajero = new Cajero();
        AtencionAlCliente atencionAlCliente = new AtencionAlCliente();

        this.setnext(responsableCarnetizacion);
        responsableCarnetizacion.setnext(notario);
        notario.setnext(cajero);
        cajero.setnext(atencionAlCliente);
        this.next.verificacion(cliente);

    }
}
