package PaqueteCajero;

import java.util.Scanner;

public abstract class ClasePadreCajero {

    protected int transacciones;
    protected int retiro;
    protected int deposito;
    private static int saldo;

    Scanner sc = new Scanner(System.in);

    public void Operaciones() {
        int validar = 0;
        int seleccion = 0;

        do {

            do {
                System.out.println("SELECCIONES UNA OPCION: ");
                System.out.println("[1]== Consulta de saldo.");
                System.out.println("[2]== Retiro de efectivo");
                System.out.println("[3]== Deposito de efectico");
                System.out.println("[4]== Salir.");
                seleccion = sc.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    validar = 1;
                } else {
                    System.out.println("************************");
                    System.out.println("Numero incorrecto, Vuelva intentar");
                    System.out.println("************************");
                }
            } while (validar == 0);
            
            if (seleccion == 1) {
                ClasePadreCajero objeto1=new ClaseHijaCajero();
                objeto1.Transacciones();
            } else if (seleccion == 2) {
                ClasePadreCajero objeto1=new ClaseHijaRetiro();
                objeto1.Transacciones();
            } else if (seleccion == 3) {
                ClasePadreCajero objeto1=new ClaseHijaDeposito();
                objeto1.Transacciones();
            } else if (seleccion == 4) {
                System.out.println("************************");
                System.out.println("SESION FINALIZADA, GRACIAS...!");
                System.out.println("************************");
                validar = 2;

            }
        } while (seleccion != 2);

    }

    //metodo para pedir retiro
    public void Retiro(){
        retiro=sc.nextInt();
    }
    
    //metodo para solicitar deposito
    public void Deposito(){
        deposito=sc.nextInt();
    }
    
    //METODO ABSTRACTO DONDE APLICAREMOS EL POLIMORFISMO
    public abstract void Transacciones();
      //POR MEDIO DE LOS METODOS SETTER Y GETTER ACCEDEREMOS A LOS ATRIBUTOS
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
}
