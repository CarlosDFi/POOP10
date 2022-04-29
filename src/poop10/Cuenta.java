/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
instancia saldo y retiros
permite almacenar montos en saldo de hasta 2000 por accion
permite retirar hasta 3 veces de saldo por iteraccion
 */
public class Cuenta {
    private double saldo;
    private int retiros;
    public Cuenta() {
        this.saldo = 0;
        this.retiros = 0;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getRetiros() {
        return retiros;
    }
    public void depositar(double monto)throws DepositoMaxException{
        System.out.println("depositando...");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en sleep"+e.getMessage());
        }
        if(monto<20000){
            saldo += monto;  
        }else{
            throw new DepositoMaxException();
        }       
    }
    public void retirar(double monto) throws SaldoInsuficienteException,RetirosOutOfBoundsException{
        System.out.println("retitando...");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error en sleep"+e.getMessage());
        }
        if(retiros < 3){
            if(saldo>=monto){
                saldo -= monto;
                retiros++;
            }else
                throw new SaldoInsuficienteException();   
        }else{
            throw new RetirosOutOfBoundsException();
        }         
    }
}
