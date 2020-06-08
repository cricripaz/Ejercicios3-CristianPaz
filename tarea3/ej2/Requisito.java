package tarea3.ej2;

public class Requisito {

   private boolean certificado;
   private boolean pago;
   private boolean ficha;


    public Requisito(boolean certificado, boolean pago, boolean ficha) {
        this.certificado = certificado;
        this.pago = pago;
        this.ficha = ficha;
    }


    public boolean isCertificado() {
        return certificado;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean isFicha() {
        return ficha;
    }

    public void setFicha(boolean ficha) {
        this.ficha = ficha;
    }
}
