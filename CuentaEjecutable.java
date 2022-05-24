public class CuentaEjecutable {

    public static void main(String[] args) {

        Cuenta cuenta_1 = new Cuenta("Jose Ernesto");
        Cuenta cuenta_2 = new Cuenta("Patrick Fernando", 300);

        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);

        //Retiramos dinero en las cuentas
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);

        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 00 soles
        System.out.println(cuenta_2); // 600 soles

    }

}
