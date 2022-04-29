/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 retorna la palabra No es posible depositar mas de 20,000$
 */
public class DepositoMaxException extends Exception {

    public DepositoMaxException() {
        super("No es posible depositar mas de 20,000$");
    }
    
}
