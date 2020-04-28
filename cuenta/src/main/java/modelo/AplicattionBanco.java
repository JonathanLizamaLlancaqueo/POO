package modelo;

public class AplicattionBanco {


    public static void main(String []args){
        Cuenta cuenta1 = new Cuenta("Jose", 200000);
        Cuenta cuenta2 = new Cuenta("Jonathan", 187000);


        System.out.println("Saldo Inicial ");
        System.out.println(cuenta1.toString());

        System.out.println("Deposito $50000");
        cuenta1.ingresar(50000);
        System.out.println(cuenta1.toString());

        System.out.println("Retira $30000");
        cuenta1.retirar(30000);

        System.out.println("Saldo final en la cuenta sera: ");
        System.out.println(cuenta1.toString());


        cuenta2.ingresar(23000);
        cuenta2.retirar(300000);
        System.out.println(cuenta2.toString());

    }



}
