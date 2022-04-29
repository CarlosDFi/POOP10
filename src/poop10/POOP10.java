/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class POOP10 {

 
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException
           /**
      ejemplificacion de error de debordamiento mediante un array 
     */
        String[] mensajes = {"elemento 1","elemento 2","elemento 3"};
        try{
            for (int i = 0; i<=3;i++){
                System.out.println("mensajes = "+mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error desbordamiento de memoria");
            System.out.println(e.getLocalizedMessage());
        }
        
        System.out.println("Hola mundo despues de try catch");
        System.out.println("#########################Finally#########################");
        /**
      ejemplificacion de error de matematico mediante una division entre 0 y uso del finally como recurso final 
     */
        try{
            float x = 10/0;
            System.out.println("x = "+x);
        }catch(ArithmeticException ae){
            System.out.println("Error "+ae.getMessage());
        }finally{
            System.out.println("Sin importar lo que pase, el bloque finally se ejecuta");
        }
        System.out.println("#########################Finally2#########################");
        /**
      ejemplificacion algo que no genera error y uso del finally como recurso final 
     */
        try{
            float x = 10/2;
            System.out.println("x = "+x);
        }catch(ArithmeticException ae){
            System.out.println("Error "+ae.getMessage());//
        }finally{
            System.out.println("Sin importar lo que pase, el bloque finally se ejecuta");
        }
        
        System.out.println("#########################Anidaciòn catchs#########################");
         /**
      ejemplificacion de error de matematico con multiples catch para diferentes situaciones
     */
        try{
            float y = 3/0;
            System.out.println(y);
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Error "+aiobe.getMessage());
        }catch(ArithmeticException ae){
            System.out.println("Error "+ae.getMessage());
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }finally{
            System.out.println("El bloque finally siempre se ejecuta");
        }
        System.out.println("#########################Propagaciòn excepciones#########################");
         /**
      creacion de una salida para errores 
     */
        try{
            float division = miMetodo(14,0);
            System.out.println("dicisiòn: "+division);
        }catch(ArithmeticException e){
            System.out.println("Error "+e.getMessage());
        }
        System.out.println("#############################Cuenta###########################");
         /**
      uso de un try con multiples catch con excepciones creadas por nosotros
     */
        try{
            Cuenta cuenta = new Cuenta();
            System.out.println("saldo: "+cuenta.getSaldo());
            cuenta.depositar(21000);
            System.out.println("saldo: "+cuenta.getSaldo());
            cuenta.retirar(500);
            System.out.println("saldo: "+cuenta.getSaldo());
            cuenta.retirar(500);
            System.out.println("saldo: "+cuenta.getSaldo());
            cuenta.retirar(500);
            System.out.println("saldo: "+cuenta.getSaldo());
            cuenta.retirar(500);
            System.out.println("saldo: "+cuenta.getSaldo());
        }catch (SaldoInsuficienteException ex) {
            System.err.println("Error "+ex.getMessage());
        }
        catch(RetirosOutOfBoundsException roobe){
            System.err.println("Error "+roobe.getMessage());
        }
        catch(DepositoMaxException dme){
            System.err.println("Error "+dme.getMessage());
        }
      
    }

    private static float miMetodo(int a, int b) throws ArithmeticException{//indicamos que arroja una excepciòn, es como un comentario, 
        return (a/b);
    }

    private static float miMetodo2(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
