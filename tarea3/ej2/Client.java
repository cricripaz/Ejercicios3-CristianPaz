package tarea3.ej2;

public class Client {



    public static void main(String[] args) {


        Organizador jefe = new Organizador();

        Thread req = new Thread(new Runnable() {
            @Override
            public void run() {
                jefe.verificacion(new Persona("pedro",new Requisito(false,false,true)));
            }
        });


        req.start();
    }
}
