package modelo;

public class Cuenta {
    private String titular;
    private double cantidad;


    Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    private String getTitular() {
        return titular;
    }

    private double getCantidad() {
        return cantidad;
    }


    public String toString() {
        return "Titular: " + this.getTitular() + "\n" +
                "Cantidad: $" + this.getCantidad()+ "\n";
    }


    void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
        } else {
            this.cantidad = 0;
        }
    }


    void retirar(double cantidad) {
        if(cantidad < 0){
            System.out.println("no se puede retirar");
        }else{
            if (this.cantidad - cantidad > 0) {
                this.cantidad = this.cantidad - cantidad;
            } else {
                System.out.println("No se puede retirar, saldo excedido");
            }
        }
    }
}
