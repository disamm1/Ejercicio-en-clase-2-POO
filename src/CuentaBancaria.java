public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;


    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void  depositar(double monto) {
        if (monto >= 0) {
           saldo = saldo + monto;
             System.out.println("-----------------------------------");
            System.out.println("Deposito Exitoso");
             System.out.println("-----------------------------------");

        }else {
            System.out.println("-----------------------------------");
            System.out.println("El monto a ingresar es negativo");
             System.out.println("Deposito fallido");
             System.out.println("-----------------------------------");
        }

    }

   public boolean retirar(double monto) {
        if (monto >= 0) {
            if(saldo - monto >= 0) {
                saldo = saldo - monto;
                return true;
            } else {
                System.out.println("El monto a retirar deja el saldo en negativo!");
                return false;
            }
           
            

        }else {
            System.out.println("El monto a retirar es negativo");
            return false;
        }

    }
    public String getTitular() {
        return titular;
    }



    public void consultarSaldo() {
        System.out.println(titular + " - cuenta " + numeroCuenta);
        System.out.println("Su saldo es de: Q" + saldo);
    }
}