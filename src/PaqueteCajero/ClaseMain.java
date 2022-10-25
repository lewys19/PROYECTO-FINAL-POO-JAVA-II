
package PaqueteCajero;


public class ClaseMain {
    public static void main(String[] args) {
        ClasePadreCajero objeto1=new ClaseHijaCajero();
        objeto1.setSaldo(200);
        objeto1.Operaciones();
    }
}
