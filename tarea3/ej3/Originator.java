package tarea3.ej3;



public class Originator {

    private Documento state;

    public void setState(Documento state) {
        System.out.println("Set ----> Documento ");
        state.showData();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("Create ----> Documento");
        state.showData();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento n){
        this.state= n.getState();
        System.out.println("Restore --- > Documento  ");
        this.state.showData();
    }
}
