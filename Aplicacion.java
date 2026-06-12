import clases.CuentaBancaria;
import clases.Persona;

public class Aplicacion {
    public static void main(String[] args) {
        //Crear 3 instancias de personas
        Persona persona1 = new Persona("Daniel", 35);
        Persona persona2 = new Persona("Pablo", 20);
        Persona persona3 = new Persona("Margoth", 58);

        //Crear 3 instancias de cuenta bancaria
        CuentaBancaria cuentaDaniel = new CuentaBancaria(350, persona1);
        CuentaBancaria cuentaPablo = new CuentaBancaria(250, persona2);
        CuentaBancaria cuentaMargoth = new CuentaBancaria(100, persona3);
    
        //Operaciones cuentaDaniel
        System.out.println("\nMovimientos de Daniel");
        cuentaDaniel.depositar(50);
        System.out.println("Saldo de la cuenta: " + cuentaDaniel.getSaldo());
        cuentaDaniel.retirar(200);
        System.out.println("Saldo de la cuenta: " + cuentaDaniel.getSaldo());

        //Operaciones cuentaPablo
        System.out.println("\nMovimientos de Pablo");
        cuentaPablo.depositar(200);
        System.out.println("Saldo de la cuenta: " + cuentaPablo.getSaldo());
        cuentaPablo.retirar(500);
        System.out.println("Saldo de la cuenta: " + cuentaPablo.getSaldo());
    
        //Operaciones cuentaMargoth
        System.out.println("\nMovimientos de Margoth");
        cuentaMargoth.depositar(100);
        System.out.println("Saldo de la cuenta: " + cuentaMargoth.getSaldo());
        cuentaMargoth.retirar(50);
        System.out.println("Saldo de la cuenta: " + cuentaMargoth.getSaldo());

        //Imprimir informacion de todas las cuentas
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
