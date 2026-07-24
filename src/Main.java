import java.util.Scanner;
public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        CuentaBancaria cb1 = new CuentaBancaria("Ada wong", "20156678", 1526);
        CuentaBancaria cb2 = new CuentaBancaria("Leon Keneddy", "25168985", 15000);
        CuentaBancaria cuentaseleccionada;

        System.out.println("-----------------------------------");
        System.out.println("Elige que quieres hacer: ");
        System.out.println("0. Terminar Programa ");
        System.out.println("1. Depositar Dinero ");
        System.out.println("2. Retirar Dinero ");
        System.out.println("3. Consultar Saldo ");

        int eleccion = scanner.nextInt();

        while (eleccion > 3 || eleccion < 0) {
            System.out.println("-----------------------------------");
            System.err.println("El numero ingresado es incorrecto, ingresa nuevamente un numero: ");
            System.out.println("0. Terminar Programa ");
            System.out.println("1. Depositar Dinero ");
            System.out.println("2. Retirar Dinero ");
            System.out.println("3. Consultar Saldo ");
            System.out.println("-----------------------------------");
            eleccion = scanner.nextInt();
            
            
        }

        while (eleccion >= 1 && eleccion <= 3){

            while (eleccion > 3 || eleccion < 0) {
            System.out.println("-----------------------------------");
            System.err.println("El numero ingresado es incorrecto, ingresa nuevamente un numero: ");
            System.out.println("0. Terminar Programa ");
            System.out.println("1. Depositar Dinero ");
            System.out.println("2. Retirar Dinero ");
            System.out.println("3. Consultar Saldo ");
            eleccion = scanner.nextInt();
            System.out.println("-----------------------------------");
            }

            
            System.out.println("-----------------------------------");
            System.out.println("Seleccione una cuenta: ");
            System.out.println("1." + cb1.getTitular());
            System.out.println("2." + cb2.getTitular());
            System.out.println("-----------------------------------");

            int eleccionc = scanner.nextInt();

            while(eleccionc != 1 && eleccionc != 2) {
                System.err.println("Numero incorrecto, Selecciona denuevo: ");
                eleccionc = scanner.nextInt();
            }

            if (eleccionc == 1){
                cuentaseleccionada = cb1;

            } else {
                cuentaseleccionada = cb2;
            }


            if (eleccion == 1){
                System.out.print("Ingresa el monto de dinero para depositar: ");
                double monto = scanner.nextDouble();
                cuentaseleccionada.depositar(monto);
            }

            if (eleccion == 2){
                System.out.print("Ingresa el monto de dinero para depositar: ");
                double monto = scanner.nextDouble();
                if(cuentaseleccionada.retirar(monto)) {
                    System.out.println("-----------------------------------");
                    System.out.println("Retiro Completado!");
                    System.out.println("-----------------------------------");
                } else {
                    System.err.println("Retiro Fallido");
                }
            }

            if (eleccion == 3){
                
                cuentaseleccionada.consultarSaldo();
            }

        System.out.println("-----------------------------------");
        System.out.println("Elige que quieres hacer: ");
        System.out.println("0. Terminar Programa ");
        System.out.println("1. Depositar Dinero ");
        System.out.println("2. Retirar Dinero ");
        System.out.println("3. Consultar Saldo ");
            eleccion = scanner.nextInt();



        }
        
        
        System.out.print("Programa terminado ");
        scanner.close();
    }
}