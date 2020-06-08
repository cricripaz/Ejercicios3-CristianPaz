package tarea3.ej3;

public class Documento {

    private int version;


    public void showData(){
        System.out.println("Version : " + version);


    }

    public Documento(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
