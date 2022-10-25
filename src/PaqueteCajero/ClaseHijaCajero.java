
package PaqueteCajero;


public class ClaseHijaCajero extends ClasePadreCajero {
    
    //metodo para aplicar el polimorfismo
    @Override
    public void Transacciones(){
        System.out.println("*****************************");
        System.out.println("TU SALDO ACTUAL ES: "+getSaldo());
        System.out.println("*****************************");
    }
}
