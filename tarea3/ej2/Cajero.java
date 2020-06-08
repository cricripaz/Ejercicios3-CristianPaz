package tarea3.ej2;

public class Cajero implements IPersonalCarnet{

    IPersonalCarnet next;
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


        if (cliente.getRequisito().isCertificado() && cliente.getRequisito().isFicha() && !cliente.getRequisito().isPago()) {
            System.out.println(cliente.getNombre() + " Pasando a Cajero");
        }else{
            this.next.verificacion(cliente);
        }
    }
}
