package tarea3.ej3;

public class Client {
    public static void main(String[] args) {


        CareTaker documento = new CareTaker();
        Originator originator = new Originator();

        Documento estudiante;


        estudiante = new Documento(1);
        originator.setState(estudiante);
        documento.addMemento(originator.createMemento());

        estudiante = new Documento(2);
        originator.setState(estudiante);
        documento.addMemento(originator.createMemento());

        estudiante = new Documento(3);
        originator.setState(estudiante);
        documento.addMemento(originator.createMemento());

        estudiante = new Documento(4);
        originator.setState(estudiante);
        documento.addMemento(originator.createMemento());

        estudiante = new Documento(5);
        originator.setState(estudiante);
        documento.addMemento(originator.createMemento());

        originator.restoreFromMemento(documento.getMemento(3));

        originator.restoreFromMemento(documento.getMemento(2));
    }

}
