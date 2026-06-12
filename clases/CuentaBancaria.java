package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    //Atributos
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    //Constructor
    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;

        //Numero aleatorio de 6 digitos
        Random numeroAleatorio = new Random();
        this.numeroCuenta = 100000 + numeroAleatorio.nextInt(900000);

        //Añadir a la lista de cuentas bancarias
        listaDeCuentasBancarias.add(this);
    }

    //Getters y Setters 
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //Depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Deposito de: " + monto + " realizado con exito");
        }else {
            System.out.println("Debes tener dinero para poder realizar el deposito");
        }
    }

    //Retirar dinero
    public void retirar(double monto) {
        if(monto > 0 && this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Retiro de: " + monto + " realizado con exito");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    //Despliega información
    public void despliegaInformacion() {
        System.out.println("\n------Datos de la cuenta--------");
        System.out.println("Numero de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo de la cuenta: " + this.saldo);
        System.out.println("Titular de la cuenta: " + this.titular.getNombre());
        //this.titular.despliegaInformacion();
    }

    //Imprimir información
    public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("Informacion de todas las cuentas bancarias");

        for(CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
        }
    }
}